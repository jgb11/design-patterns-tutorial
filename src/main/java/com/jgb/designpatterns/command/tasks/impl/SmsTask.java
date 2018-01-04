package com.jgb.designpatterns.command.tasks.impl;

import com.jgb.designpatterns.command.tasks.Task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SmsTask implements Task {

    private static final Logger LOG = LogManager.getLogger(LoggingTask.class);

    @Override
    public void execute() {
        LOG.info("Sending SMS...");
    }
}
