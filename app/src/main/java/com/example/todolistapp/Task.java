package com.example.todolistapp;

import java.util.Date;

public class Task {
    private String TaskName;
    private boolean Status;
    private boolean Star;
    private Date RemindDate;
    private Date RunDate;
    private boolean Repeat;
    private String GlobalDescription;

    public boolean isStar() {
        return Star;
    }

    public void setStar(boolean star) {
        Star = star;
    }

    public String getTaskName() {
        return TaskName;
    }

    public void setTaskName(String taskName) {
        TaskName = taskName;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public Date getRemindDate() {
        return RemindDate;
    }

    public void setRemindDate(Date remindDate) {
        RemindDate = remindDate;
    }

    public Date getRunDate() {
        return RunDate;
    }

    public void setRunDate(Date runDate) {
        RunDate = runDate;
    }

    public boolean isRepeat() {
        return Repeat;
    }

    public void setRepeat(boolean repeat) {
        Repeat = repeat;
    }

    public String getGlobalDescription() {
        return GlobalDescription;
    }

    public void setGlobalDescription(String globalDescription) {
        GlobalDescription = globalDescription;
    }
}
