package hack.task.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * Класс, представляющий список назначений задач на ресурсы.
 */
@Data
@Schema(description = "Класс, представляющий список назначений задач на ресурсы")
public class Assignments {

    @Schema(description = "Список назначений")
    private List<Assignment> rows;
}