package hack.task;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Класс, представляющий оптимизированный план проекта.
 */
@Data
class OptimizedPlan {
    private List<Map<String, Object>> tasks;
}