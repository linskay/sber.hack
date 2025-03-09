package hack.task;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

/**
 * Класс, представляющий задачу.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class Task {
    private long id;
    private String name;
    private int duration;
    private String role;
    private String constraintType;
    private String constraintDate;
    private List<Integer> dependencies;
}
