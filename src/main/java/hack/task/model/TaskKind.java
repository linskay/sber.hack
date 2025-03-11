package hack.task.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * Класс, представляющий тип задачи.
 */
@Data
@Schema(description = "Класс, представляющий тип задачи")
public class TaskKind {
    @Schema(description = "Идентификатор сущности", example = "7392625257454436357")
    private String entityId;

    @Schema(description = "Идентификатор корневой сущности", example = "ai_plan_recalc_mvp")
    private String rootEntityId;
}