package com.nskhoa.designpattern.STRUCTURAL.adapter.example31;

public class QuartzAdapter implements TaskScheduler {
    private QuartzScheduler quartz = new QuartzScheduler();
    public void scheduleTask(String jobName, String cronExpr) {
        quartz.quartzSchedule(jobName, cronExpr);
    }
}
