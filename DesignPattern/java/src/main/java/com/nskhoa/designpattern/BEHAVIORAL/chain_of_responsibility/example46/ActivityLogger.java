package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example46;

public class ActivityLogger extends ProctoringHandler {
    @Override
    public void monitor(ExamSession session) {
        System.out.println("Logging user activity.");
        session.setActivityLogged(true);
        if (nextHandler != null) {
            nextHandler.monitor(session);
        }
    }
}
