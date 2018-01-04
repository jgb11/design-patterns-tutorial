package com.jgb.designpatterns.command.tasks.impl;

import com.jgb.designpatterns.command.tasks.Task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileIOTask implements Task {

    private static final Logger LOG = LogManager.getLogger(FileIOTask.class);

    @Override
    public void execute(){
		LOG.info("Executing File IO operations...");
	}
}
