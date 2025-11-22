package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example46;

public class ExamProctoringDemo {
    public static void main(String[] args) {
        ProctoringHandler cheatingChecker = new CheatingChecker();
        ProctoringHandler activityLogger = new ActivityLogger();
        ProctoringHandler timeEnforcer = new TimeLimitEnforcer();

        cheatingChecker.setNextHandler(activityLogger);
        activityLogger.setNextHandler(timeEnforcer);

        ExamSession session = new ExamSession();
        cheatingChecker.monitor(session);
    }
}
