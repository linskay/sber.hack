package hack.task.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AssignmentRow {
    private String event;
    private String resource;
    private int units;
    private String startDate;
    private String endDate;
    private long currentEffort;
    private String guid;
    private String id;
}