package hack.task.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Resource {
    private String id;
    private String name;
    private String projectRole;
    private String reservationType;
    private int reservationPercent;
    private String reservationStatus;
    private String projectRoleId;
    private boolean reservePartially;
    private List<PerformedTaskKind> performedTaskKinds;
}