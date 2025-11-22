package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example46;

public abstract class ProctoringHandler {
    protected ProctoringHandler nextHandler;

    public void setNextHandler(ProctoringHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void monitor(ExamSession session);
}
