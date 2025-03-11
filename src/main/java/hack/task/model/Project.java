package hack.task.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * Основной класс, представляющий проект.
 */
@Data
@Schema(description = "Основной класс, представляющий проект")
public class Project {
    @Schema(description = "Уникальный идентификатор запроса", example = "d6c4b902-c884-4f3f-82f0-88714c68862c")
    private String requestId;

    @Schema(description = "Детали проекта")
    private ProjectDetails project;

    @Schema(description = "Список задач")
    private Tasks tasks;

    @Schema(description = "Зависимости между задачами")
    private Dependencies dependencies;

    @Schema(description = "Календари проекта")
    private Calendars calendars;

    @Schema(description = "Ресурсы проекта")
    private Resources resources;

    @Schema(description = "Назначения задач на ресурсы")
    private Assignments assignments;
}