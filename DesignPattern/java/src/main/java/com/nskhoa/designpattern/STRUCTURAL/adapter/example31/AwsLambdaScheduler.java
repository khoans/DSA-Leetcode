package com.nskhoa.designpattern.STRUCTURAL.adapter.example31;

public class AwsLambdaScheduler {
    void lambdaSchedule(String job, String cron) {
        System.out.println("AWS Lambda scheduling job " + job + " with " + cron);
    }
}
