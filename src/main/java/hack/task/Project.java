package hack.task;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

/**
 * Класс, представляющий проект.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class Project {
    private String requestId;
    private List<Task> tasks;
    private List<Resource> resources;
    private ProjectCalendar projectCalendar;
}
