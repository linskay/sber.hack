package hack.task.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DependencyRow {
    private String fromEvent;
    private String toEvent;
    private double lag;
    private String lagUnit;
    private int type;
    private String guid;
    private String id;
}
