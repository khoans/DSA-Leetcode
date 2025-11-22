package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example46;

public class TimeLimitEnforcer extends ProctoringHandler {
    @Override
    public void monitor(ExamSession session) {
        System.out.println("Enforcing time limits.");
        session.setTimeLimitEnforced(true);
    }
}
