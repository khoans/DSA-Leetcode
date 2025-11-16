package com.nskhoa.designpattern.CREATIONAL.builder.example5;

public class SalesReport {
    private String data;
    private String chart;
    private String conclusion;

    private SalesReport(Builder builder) {
        this.data = builder.data; this.chart = builder.chart; this.conclusion = builder.conclusion;
    }

    public static class Builder {
        private String data;
        private String chart;
        private String conclusion;

        public Builder data(String d) {
            this.data = d; return this;
        }

        public Builder chart(String c) {
            this.chart = c; return this;
        }

        public Builder conclusion(String con) {
            this.conclusion = con; return this;
        }

        public SalesReport build() {
            return new SalesReport(this);
        }
    }

    public static void main(String[] args) {
        SalesReport report = new SalesReport.Builder()
                .data("Q1 Sales Data")
                .chart("Bar Chart")
                .conclusion("Sales increased by 20%")
                .build();
        System.out.println("Data: " + report.data);
        System.out.println("Chart: " + report.chart);
        System.out.println("Conclusion: " + report.conclusion);
    }
}
