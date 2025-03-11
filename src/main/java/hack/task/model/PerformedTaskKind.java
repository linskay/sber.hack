package hack.task.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PerformedTaskKind {
    private String entityId;
    private String rootEntityId;
}
