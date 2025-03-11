package hack.task.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * Класс, представляющий назначение задачи на ресурс.
 */
@Data
@Schema(description = "Класс, представляющий назначение задачи на ресурс")
public class Assignment {

    @Schema(description = "Идентификатор задачи", example = "7476064025108086788")
    private String event;

    @Schema(description = "Идентификатор ресурса", example = "7476063767410049036")
    private String resource;

    @Schema(description = "Процент загрузки ресурса", example = "100")
    private int units;

    @Schema(description = "Дата начала выполнения задачи", example = "2024-02-07T15:22:07")
    private String startDate;

    @Schema(description = "Дата окончания выполнения задачи", example = "2024-02-14T15:22:07")
    private String endDate;

    @Schema(description = "Текущие усилия (в миллисекундах)", example = "144000000")
    private long currentEffort;

    @Schema(description = "Уникальный идентификатор назначения (GUID)", example = "d6f73a0f-4d88-45cf-9d14-e0878bd0f466")
    private String guid;

    @Schema(description = "Уникальный идентификатор назначения", example = "7476064025108086799")
    private String id;
}