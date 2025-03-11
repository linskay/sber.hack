package hack.task.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * Класс, представляющий список задач.
 */
@Data
@Schema(description = "Класс, представляющий список задач")
public class Tasks {
    @Schema(description = "Список задач")
    private List<TaskRow> rows;
}