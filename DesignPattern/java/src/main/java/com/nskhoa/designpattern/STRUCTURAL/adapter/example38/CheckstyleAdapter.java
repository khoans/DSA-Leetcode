package com.nskhoa.designpattern.STRUCTURAL.adapter.example38;

public class CheckstyleAdapter implements CodeQualityTool {
    private CheckstyleTool checkstyle = new CheckstyleTool();
    public void analyzeCode(String codebase) {
        checkstyle.checkstyleAnalyze(codebase);
    }
}
