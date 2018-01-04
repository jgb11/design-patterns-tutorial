package com.jgb.designpatterns.command.job.impl;

import com.jgb.designpatterns.command.job.Job;
import com.jgb.designpatterns.command.tasks.Task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * @author jgb
 * @since 04/01/2018 18:44
 */
public class RunTaskJob<T extends Task> implements Job {

    private static final Logger LOG = LogManager.getLogger(RunTaskJob.class);

    private T t;

    public void setTask(T task) {
        this.t = task;
    }

    @Override
    public void run() {
        LOG.info("{\"jobId\":\"" + Thread.currentThread().getId() + "\", \"jobType\":\"" + t.getClass().getSimpleName() + "\"}");

        Optional.ofNullable(t).ifPresent(T::execute);
        sleepOneSecond();
    }

    private void sleepOneSecond() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
