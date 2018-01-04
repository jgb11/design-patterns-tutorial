package com.jgb.designpatterns.command;

import com.jgb.designpatterns.command.job.Job;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@SuppressWarnings("squid:S2142")
public class ThreadPool {

    private static final Logger LOG = LogManager.getLogger(ThreadPool.class);

    private final BlockingQueue<Job> jobQueue;
    private final Thread[] jobThreads;
    private volatile boolean shutdown;

    public ThreadPool(int n) {
        jobQueue = new LinkedBlockingQueue<>();
        jobThreads = new Thread[n];

        for (int i = 0; i < n; i++) {
            jobThreads[i] = new Worker("Pool Thread " + i);
            jobThreads[i].start();
        }
    }

    public void addJob(Job r) {
        try {
            jobQueue.put(r);
        } catch (InterruptedException e) {
            LOG.error(e.getMessage(), e);
            Thread.currentThread().interrupt();
        }
    }

    public void shutdownPool() {
        while (!jobQueue.isEmpty()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                LOG.error(e.getMessage(), e);
            }
        }
        shutdown = true;
        Arrays.stream(jobThreads).forEach(Thread::interrupt);
    }

    private class Worker extends Thread {
        public Worker(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (!shutdown) {
                try {
                    final Job r = jobQueue.take();
                    r.run();
                } catch (InterruptedException e) {
                    LOG.error(e.getMessage(), e);
                }
            }
        }
    }

}
