package org.lorislab.p6.bpmn2.model;

public class TimerEventDefinition extends EventDefinition {

    private Expression timeDate;

    private Expression timeDuration;

    private Expression timeCycle;

    public TimerEventDefinition() {
        super(EventDefinitionClass.TIMER_EVENT_DEFINITION);
    }

    public Expression getTimeDate() {
        return timeDate;
    }

    public void setTimeDate(Expression timeDate) {
        this.timeDate = timeDate;
    }

    public Expression getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(Expression timeDuration) {
        this.timeDuration = timeDuration;
    }

    public Expression getTimeCycle() {
        return timeCycle;
    }

    public void setTimeCycle(Expression timeCycle) {
        this.timeCycle = timeCycle;
    }
}
