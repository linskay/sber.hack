package hack.task.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * Класс, представляющий задачу.
 */
@Data
@Schema(description = "Класс, представляющий задачу")
public class Task {
    @Schema(description = "Уникальный идентификатор задачи", example = "7476064025108086788")
    private String id;

    @Schema(description = "Название задачи", example = "Аналитика")
    private String name;

    @Schema(description = "Роль, необходимая для выполнения задачи", example = "Аналитик")
    private String role;

    @Schema(description = "Дата начала задачи", example = "2024-02-07T15:22:07")
    private String startDate;

    @Schema(description = "Дата окончания задачи", example = "2024-02-14T15:22:07")
    private String endDate;

    @Schema(description = "Усилия, затраченные на задачу", example = "5.0")
    private double effort;

    @Schema(description = "Единица измерения усилий", example = "d")
    private String effortUnit;

    @Schema(description = "Продолжительность задачи", example = "5.0")
    private double duration;

    @Schema(description = "Единица измерения продолжительности", example = "d")
    private String durationUnit;

    @Schema(description = "Процент выполнения задачи", example = "0.0")
    private double percentDone;

    @Schema(description = "Режим планирования", example = "FixedUnits")
    private String schedulingMode;

    @Schema(description = "Тип ограничения", example = "startnoearlierthan")
    private String constraintType;

    @Schema(description = "Дата ограничения", example = "2024-02-07T15:22:07")
    private String constraintDate;

    @Schema(description = "Флаг ручного планирования", example = "false")
    private boolean manuallyScheduled;

    @Schema(description = "Флаг управления усилиями", example = "false")
    private boolean effortDriven;

    @Schema(description = "Флаг раскрытия задачи", example = "true")
    private boolean expanded;

    @Schema(description = "Флаг свертки задачи", example = "false")
    private boolean rollup;

    @Schema(description = "Флаг неактивности задачи", example = "false")
    private boolean inactive;

    @Schema(description = "Флаг корневой задачи", example = "false")
    private boolean rootTask;

    @Schema(description = "Тип задачи")
    private TaskKind taskKind;

    @Schema(description = "Флаг переноса задачи", example = "false")
    private boolean isTransferred;

    @Schema(description = "Приоритет задачи", example = "1")
    private int priority;

    @Schema(description = "Сумма назначенных единиц", example = "100.0")
    private double assignmentsUnitsSum;

    @Schema(description = "Уникальный идентификатор задачи (GUID)", example = "e23a6336-e1e0-4552-9545-173e3ca57cd7")
    private String guid;

    @Schema(description = "Список дочерних задач")
    private List<Task> children;
}