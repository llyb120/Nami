package com.github.llyb120.nami.cron;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public interface ICron extends Job {

    void run() throws Exception;

    @Override
    default void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        try {
            this.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
