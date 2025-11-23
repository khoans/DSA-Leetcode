package com.nskhoa.designpattern.STRUCTURAL.adapter.example38;

public class Client {
    private CodeQualityTool tool;
    public Client(CodeQualityTool tool) {
        this.tool = tool;
    }
    public void performAnalysis(String codebase) {
        tool.analyzeCode(codebase);
    }

    public static void main(String[] args) {
        CodeQualityTool sonarAdapter = new SonarQubeAdapter();
        CodeQualityTool eslintAdapter = new ESLintAdapter();
        CodeQualityTool checkstyleAdapter = new CheckstyleAdapter();

        Client sonarClient = new Client(sonarAdapter);
        Client eslintClient = new Client(eslintAdapter);
        Client checkstyleClient = new Client(checkstyleAdapter);

        sonarClient.performAnalysis("ProjectA Codebase");
        eslintClient.performAnalysis("ProjectB Codebase");
        checkstyleClient.performAnalysis("ProjectC Codebase");
    }
}
