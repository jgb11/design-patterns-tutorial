package com.jgb.designpatterns.chainofresponsibility.handlers;

import com.jgb.designpatterns.chainofresponsibility.model.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DocFileHandler implements Handler {

    private static final Logger LOG = LogManager.getLogger(DocFileHandler.class);

    private Handler handler;
    private String handlerName;

    public DocFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {

        if (file.getFileType().equals("doc")) {
            LOG.info("Process and saving doc file... by " + handlerName);
        } else if (handler != null) {
            LOG.info(handlerName + " fowards request to " + handler.getHandlerName());
            handler.process(file);
        } else {
            LOG.warn("File not supported");
        }

    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }

}
