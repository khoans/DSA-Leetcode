package com.nskhoa.designpattern.STRUCTURAL.adapter.example31;

public class Client {
    public static void main(String[] args) {
        TaskScheduler quartzAdapter = new QuartzAdapter();
        quartzAdapter.scheduleTask("DataBackup", "0 0 * * *");

        TaskScheduler cronAdapter = new CronAdapter();
        cronAdapter.scheduleTask("LogCleanup", "0 1 * * *");

        TaskScheduler awsLambdaAdapter = new AwsLambdaAdapter();
        awsLambdaAdapter.scheduleTask("ReportGeneration", "0 2 * * *");
    }
}
