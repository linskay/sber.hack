package hack.task.controller;

import hack.task.model.Project;
import hack.task.service.ProjectService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Контроллер для управления проектами.
 * Предоставляет REST API для оптимизации проектов.
 */
@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);

    @Autowired
    private ProjectService projectService;

    /**
     * Оптимизирует проект на основе входных данных.
     *
     * @param project Данные проекта для оптимизации.
     * @return Оптимизированный проект.
     */
    @Operation(summary = "Оптимизировать проект", description = "Оптимизирует проект на основе входных данных")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Проект успешно оптимизирован",
                    content = @Content(schema = @Schema(implementation = Project.class))),
            @ApiResponse(responseCode = "400", description = "Неверные входные данные")
    })
    @PostMapping("/optimize")
    public Project optimizeProject(
            @Parameter(description = "Данные проекта для оптимизации", required = true)
            @RequestBody Project project) {
        logger.info("Получен запрос на оптимизацию проекта: {}", project.getProject().getName());
        Project optimizedProject = projectService.optimizeProject(project);
        logger.info("Оптимизация завершена для проекта: {}", project.getProject().getName());
        return optimizedProject;
    }
}