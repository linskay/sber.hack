package hack.task.service;

import hack.task.model.Project;
import hack.task.optimizer.ProjectOptimizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Сервис для работы с проектами.
 * Содержит бизнес-логику для оптимизации проектов.
 */
@Service
public class ProjectService {

    private static final Logger logger = LoggerFactory.getLogger(ProjectService.class);

    /**
     * Оптимизирует проект.
     *
     * @param project Проект для оптимизации.
     * @return Оптимизированный проект.
     */
    public Project optimizeProject(Project project) {
        logger.info("Начало оптимизации проекта: {}", project.getProject().getName());
        ProjectOptimizer optimizer = new ProjectOptimizer();
        Project optimizedProject = optimizer.optimize(project);
        logger.info("Оптимизация завершена для проекта: {}", project.getProject().getName());
        return optimizedProject;
    }
}