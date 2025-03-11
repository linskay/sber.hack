package hack.task.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * Класс, представляющий строку задачи.
 */
@Data
@Schema(description = "Класс, представляющий строку задачи")
public class TaskRow {
    @Schema(description = "Список дочерних задач")
    private List<Task> children;

    @Schema(description = "Название задачи", example = "Проект 1")
    private String name;

    @Schema(description = "Дата начала задачи", example = "2024-02-07T15:22:07")
    private String startDate;

    @Schema(description = "Дата окончания задачи", example = "2024-03-07T15:22:07")
    private String endDate;

    @Schema(description = "Усилия, затраченные на задачу", example = "20.0")
    private double effort;

    @Schema(description = "Единица измерения усилий", example = "d")
    private String effortUnit;

    @Schema(description = "Продолжительность задачи", example = "20.0")
    private double duration;

    @Schema(description = "Единица измерения продолжительности", example = "d")
    private String durationUnit;

    @Schema(description = "Процент выполнения задачи", example = "0.0")
    private double percentDone;

    @Schema(description = "Режим планирования", example = "FixedUnits")
    private String schedulingMode;

    @Schema(description = "Флаг ручного планирования", example = "false")
    private boolean manuallyScheduled;

    @Schema(description = "Флаг управления усилиями", example = "false")
    private boolean effortDriven;

    @Schema(description = "Индекс родительской задачи", example = "0")
    private int parentIndex;

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

    @Schema(description = "Сумма назначенных единиц", example = "0.0")
    private double assignmentsUnitsSum;

    @Schema(description = "Уникальный идентификатор задачи (GUID)", example = "25f891a3-b244-487d-9880-3ccea45a96ff")
    private String guid;

    @Schema(description = "Уникальный идентификатор задачи", example = "7476064025108086787")
    private String id;
}