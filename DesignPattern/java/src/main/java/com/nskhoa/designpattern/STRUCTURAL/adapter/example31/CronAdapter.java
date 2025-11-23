package com.nskhoa.designpattern.STRUCTURAL.adapter.example31;

public class CronAdapter implements TaskScheduler {
    private CronScheduler cron = new CronScheduler();
    public void scheduleTask(String jobName, String cronExpr) {
        cron.cronSchedule(jobName, cronExpr);
    }
}
