package hack.task.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * Класс, содержащий детали проекта.
 */
@Data
@Schema(description = "Класс, содержащий детали проекта")
public class ProjectDetails {
    @Schema(description = "Уникальный идентификатор проекта", example = "7476064025108086785")
    private String id;

    @Schema(description = "Идентификатор проекта", example = "7476063426289008641")
    private String projectId;

    @Schema(description = "Название проекта", example = "исходный")
    private String name;

    @Schema(description = "Флаг только для чтения", example = "false")
    private boolean isReadOnly;

    @Schema(description = "Календарь проекта", example = "general")
    private String calendar;

    @Schema(description = "Тип плана", example = "DRAFT")
    private String planType;

    @Schema(description = "Дата последнего изменения", example = "2025-02-27T15:22:12.517")
    private String lastModifyDate;

    @Schema(description = "Дата начала проекта", example = "2024-02-05")
    private String startDate;

    @Schema(description = "Дата окончания проекта", example = "2025-02-27")
    private String endDate;
}