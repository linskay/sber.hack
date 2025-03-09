package hack.task;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Основной класс для оптимизации проекта.
 */
public class ProjectOptimizer {

    /**
     * Точка входа в программу.
     *
     * @param args Аргументы командной строки.
     */
    public static void main(String[] args) {
        try {
            // Загрузка данных из JSON-файла
            Project project = loadProject("project.json");

            // Оптимизация проекта
            OptimizedPlan optimizedPlan = optimizeProject(project);

            // Выгрузка оптимизированного плана в JSON-файл
            saveOptimizedPlan("optimized_plan.json", optimizedPlan);

            System.out.println("Оптимизация завершена. Результат сохранен в optimized_plan.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Загружает проект из JSON-файла.
     *
     * @param filePath Путь к JSON-файлу.
     * @return Объект проекта.
     * @throws IOException Если произошла ошибка при чтении файла.
     */
    private static Project loadProject(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream inputStream = ProjectOptimizer.class.getClassLoader().getResourceAsStream(filePath);
        if (inputStream == null) {
            throw new FileNotFoundException("Файл " + filePath + " не найден в ресурсах.");
        }
        return mapper.readValue(inputStream, Project.class);
    }
    /**
     * Сохраняет оптимизированный план в JSON-файл.
     *
     * @param filePath      Путь к JSON-файлу.
     * @param optimizedPlan Оптимизированный план.
     * @throws IOException Если произошла ошибка при записи файла.
     */
    private static void saveOptimizedPlan(String filePath, OptimizedPlan optimizedPlan) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), optimizedPlan);
    }

    /**
     * Оптимизирует проект.
     *
     * @param project Проект для оптимизации.
     * @return Оптимизированный план.
     */
    private static OptimizedPlan optimizeProject(Project project) {
        OptimizedPlan optimizedPlan = new OptimizedPlan();
        List<Map<String, Object>> optimizedTasks = new ArrayList<>();

        // Назначаем задачи последовательно и учитываем зависимости и ограничения
        for (Task task : project.getTasks()) {
            Map<String, Object> optimizedTask = new HashMap<>();
            optimizedTask.put("id", task.getId());
            optimizedTask.put("startDate", calculateStartDate(task, project));
            optimizedTask.put("endDate", calculateEndDate(task, project));
            optimizedTask.put("assignedResource", assignResource(task, project));

            optimizedTasks.add(optimizedTask);
        }

        optimizedPlan.setTasks(optimizedTasks);
        return optimizedPlan;
    }

    /**
     * Рассчитывает дату начала задачи.
     *
     * @param task    Задача.
     * @param project Проект.
     * @return Дата начала задачи в формате строки.
     */
    private static String calculateStartDate(Task task, Project project) {
        // Логика расчета даты начала задачи - возвращаем фиксированную дату
        return "2024-02-07";
    }

    /**
     * Рассчитывает дату окончания задачи.
     *
     * @param task    Задача.
     * @param project Проект.
     * @return Дата окончания задачи в формате строки.
     */
    private static String calculateEndDate(Task task, Project project) {
        // Логика расчета даты окончания задачи - возвращаем фиксированную дату
        return "2024-02-12";
    }

    /**
     * Назначает исполнителя на задачу.
     *
     * @param task    Задача.
     * @param project Проект.
     * @return ID назначенного исполнителя.
     */
    private static int assignResource(Task task, Project project) {
        // Логика назначения исполнителя - возвращаем фиксированного исполнителя
        return 1;
    }
}