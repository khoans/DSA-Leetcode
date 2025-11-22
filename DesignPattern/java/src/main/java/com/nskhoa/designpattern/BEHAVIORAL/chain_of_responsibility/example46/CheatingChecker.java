package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example46;

public class CheatingChecker extends ProctoringHandler {
    @Override
    public void monitor(ExamSession session) {
        System.out.println("Checking for cheating...");
        session.setCheatingDetected(false); // simulate no cheating
        if (session.isCheatingDetected()) {
            System.out.println("Cheating detected! Alerting.");
        }
        else if (nextHandler != null) {
            nextHandler.monitor(session);
        }
    }
}
