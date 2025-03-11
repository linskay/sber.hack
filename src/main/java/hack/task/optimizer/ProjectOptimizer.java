package hack.task.optimizer;

import hack.task.model.Project;
import hack.task.model.Task;
import hack.task.model.Resource;
import hack.task.model.Assignment;
import hack.task.model.Assignments;
import hack.task.model.Resources;
import hack.task.model.TaskRow;
import hack.task.model.Tasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Класс для оптимизации проектов.
 * Содержит логику для минимизации продолжительности проекта и ресурсных затрат.
 */
public class ProjectOptimizer {

    private static final Logger logger = LoggerFactory.getLogger(ProjectOptimizer.class);
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    /**
     * Оптимизирует проект.
     *
     * @param project Проект для оптимизации.
     * @return Оптимизированный проект.
     */
    public Project optimize(Project project) {
        logger.info("Начало оптимизации проекта: {}", project.getProject().getName());

        // Получаем задачи и ресурсы
        Tasks tasks = project.getTasks();
        Resources resources = project.getResources();
        Assignments assignments = project.getAssignments();

        // Оптимизируем задачи
        optimizeTasks(tasks, resources, assignments);

        logger.info("Оптимизация завершена для проекта: {}", project.getProject().getName());
        return project;
    }

    /**
     * Оптимизирует задачи проекта.
     *
     * @param tasks       Список задач.
     * @param resources   Список ресурсов.
     * @param assignments Назначения задач на ресурсы.
     */
    private void optimizeTasks(Tasks tasks, Resources resources, Assignments assignments) {
        // Сортируем задачи по дате начала
        List<TaskRow> taskRows = tasks.getRows();
        taskRows.sort(Comparator.comparing(TaskRow::getStartDate));

        // Назначаем задачи на ресурсы
        for (TaskRow taskRow : taskRows) {
            for (Task task : taskRow.getChildren()) {
                assignTaskToResource(task, resources, assignments);
            }
        }
    }

    /**
     * Назначает задачу на ресурс.
     *
     * @param task        Задача.
     * @param resources   Список ресурсов.
     * @param assignments Назначения задач на ресурсы.
     */
    private void assignTaskToResource(Task task, Resources resources, Assignments assignments) {
        // Находим подходящий ресурс
        Resource resource = findAvailableResource(task, resources);

        if (resource != null) {
            // Создаем назначение
            Assignment assignment = new Assignment();
            assignment.setEvent(task.getId());
            assignment.setResource(resource.getId());
            assignment.setUnits(100); // 100% загрузка ресурса
            assignment.setStartDate(task.getStartDate());
            assignment.setEndDate(task.getEndDate());

            // Добавляем назначение в список
            assignments.getRows().add(assignment);

            logger.info("Задача '{}' назначена на ресурс '{}'", task.getName(), resource.getName());
        } else {
            logger.warn("Не удалось найти подходящий ресурс для задачи '{}'", task.getName());
        }
    }

    /**
     * Находит доступный ресурс для задачи.
     *
     * @param task      Задача.
     * @param resources Список ресурсов.
     * @return Доступный ресурс или null, если ресурс не найден.
     */
    private Resource findAvailableResource(Task task, Resources resources) {
        for (Resource resource : resources.getRows()) {
            if (isResourceAvailable(resource, task)) {
                return resource;
            }
        }
        return null;
    }

    /**
     * Проверяет, доступен ли ресурс для задачи.
     *
     * @param resource Ресурс.
     * @param task     Задача.
     * @return true, если ресурс доступен, иначе false.
     */
    private boolean isResourceAvailable(Resource resource, Task task) {
        // Простая проверка: ресурс доступен, если его роль совпадает с ролью задачи
        return resource.getProjectRole().equals(task.getRole());
    }
}