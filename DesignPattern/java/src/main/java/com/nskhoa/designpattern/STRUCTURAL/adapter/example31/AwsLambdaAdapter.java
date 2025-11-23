package com.nskhoa.designpattern.STRUCTURAL.adapter.example31;

public class AwsLambdaAdapter implements TaskScheduler {
    private AwsLambdaScheduler lambda = new AwsLambdaScheduler();
    public void scheduleTask(String jobName, String cronExpr) {
        lambda.lambdaSchedule(jobName, cronExpr);
    }
}
