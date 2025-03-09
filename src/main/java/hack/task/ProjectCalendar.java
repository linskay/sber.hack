package hack.task;

import lombok.Data;

import java.util.List;

/**
 * Класс, представляющий календарь проекта.
 */
@Data
class ProjectCalendar {
    private List<String> workingDays;
    private List<String> holidays;
}
