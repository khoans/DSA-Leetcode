package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example44;

public class CodeReviewDemo {
    public static void main(String[] args) {
        CodeReviewHandler style = new StyleChecker();
        CodeReviewHandler security = new SecurityChecker();
        CodeReviewHandler performance = new PerformanceChecker();

        style.setNextHandler(security);
        security.setNextHandler(performance);

        CodeChange code = new CodeChange("some code changes");
        style.review(code);
    }
}
