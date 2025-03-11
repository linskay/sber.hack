package hack.task.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Interval {
    private String recurrentStartDate;
    private String recurrentEndDate;
    private boolean isWorking;
    private String name;
    private String startDate;
    private String endDate;
    private int priority;
    private String recurrentWeekday;
    private String workException;
    private String overriddenWorkDayTimeInterval;
}