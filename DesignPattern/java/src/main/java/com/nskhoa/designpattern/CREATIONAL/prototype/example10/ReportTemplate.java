package com.nskhoa.designpattern.creational.prototype.example10;

import java.util.ArrayList;
import java.util.List;

public class ReportTemplate implements Cloneable {
    private String title;
    private List<String> sections = new ArrayList<>();

    public ReportTemplate(String title) {
        this.title = title;
    }

    public void addSection(String sec) {
        sections.add(sec);
    }

    public ReportTemplate clone() {
        try {
            ReportTemplate cloned = (ReportTemplate) super.clone(); cloned.sections = new ArrayList<>(sections);
            return cloned;
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        ReportTemplate monthlyReport = new ReportTemplate("Monthly Report");
        monthlyReport.addSection("Introduction");
        monthlyReport.addSection("Financial Overview");
        monthlyReport.addSection("Conclusion");

        ReportTemplate clonedReport = monthlyReport.clone();
        clonedReport.addSection("Appendix");

        System.out.println("Monthly Report Sections: " + monthlyReport.sections);
        System.out.println("Cloned Report Sections: " + clonedReport.sections);
    }
}
