package com.nskhoa.designpattern.STRUCTURAL.adapter.example31;

public class QuartzScheduler {
    void quartzSchedule(String job, String cron) {
        System.out.println("Quartz scheduling job " + job + " with " + cron);
    }
}
