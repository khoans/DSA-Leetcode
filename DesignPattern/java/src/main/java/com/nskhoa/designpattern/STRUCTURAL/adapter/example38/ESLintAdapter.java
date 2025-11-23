package com.nskhoa.designpattern.STRUCTURAL.adapter.example38;

public class ESLintAdapter implements CodeQualityTool {
    private ESLintTool eslint = new ESLintTool();
    public void analyzeCode(String codebase) {
        eslint.eslintAnalyze(codebase);
    }
}
