package com.nskhoa.designpattern.STRUCTURAL.adapter.example38;

public class SonarQubeAdapter implements CodeQualityTool {
    private SonarQubeTool sonar = new SonarQubeTool();
    public void analyzeCode(String codebase) {
        sonar.sonarAnalyze(codebase);
    }
}
