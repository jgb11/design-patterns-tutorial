package com.jgb.designpatterns.command;

import com.jgb.designpatterns.command.job.impl.*;
import com.jgb.designpatterns.command.tasks.Task;
import com.jgb.designpatterns.command.tasks.impl.EmailTask;
import com.jgb.designpatterns.command.tasks.impl.FileIOTask;
import com.jgb.designpatterns.command.tasks.impl.LoggingTask;
import com.jgb.designpatterns.command.tasks.impl.SmsTask;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jgb
 * @since 04/01/2018 18:58
 */
public class ThreadPoolTest {

    private ThreadPool pool;

    @Before
    public void setUp() {
        pool = new ThreadPool(10);
    }

    @Test
    public void testThreadPool() {

        final RunTaskJob emailJob = new RunTaskJob<EmailTask>();
        final RunTaskJob smsJob = new RunTaskJob<EmailTask>();
        final RunTaskJob fileIOJob = new RunTaskJob<FileIOTask>();
        final RunTaskJob logJob = new RunTaskJob<LoggingTask>();

        for (int i = 0; i < 5; i++) {
            final Task emailTask = new EmailTask();
            emailJob.setTask(emailTask);

            final Task smsTask = new SmsTask();
            smsJob.setTask(smsTask);

            final Task fileIOTask = new FileIOTask();
            fileIOJob.setTask(fileIOTask);

            final Task loggingTask = new LoggingTask();
            logJob.setTask(loggingTask);

            pool.addJob(emailJob);
            pool.addJob(smsJob);
            pool.addJob(fileIOJob);
            pool.addJob(logJob);
        }
        pool.shutdownPool();
    }
}