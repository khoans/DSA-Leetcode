package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example46;

public class ExamSession {
    private boolean cheatingDetected;
    private boolean activityLogged;
    private boolean timeLimitEnforced;

    public boolean isCheatingDetected() {
        return cheatingDetected;
    }

    public void setCheatingDetected(boolean val) {
        cheatingDetected = val;
    }

    public boolean isActivityLogged() {
        return activityLogged;
    }

    public void setActivityLogged(boolean val) {
        activityLogged = val;
    }

    public boolean isTimeLimitEnforced() {
        return timeLimitEnforced;
    }

    public void setTimeLimitEnforced(boolean val) {
        timeLimitEnforced = val;
    }
}
