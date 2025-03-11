package hack.task.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CalendarRow {
    private String id;
    private String name;
    private boolean expanded;
    private String lastSaveDate;
    private boolean isOverriddenDateGrid;
    private List<Interval> intervals;
}