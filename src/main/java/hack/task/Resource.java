package hack.task;

import lombok.Data;

import java.util.List;

/**
 * Класс, представляющий исполнителя.
 */
@Data
class Resource {
    private int id;
    private String role;
    private List<String> calendar;
}
