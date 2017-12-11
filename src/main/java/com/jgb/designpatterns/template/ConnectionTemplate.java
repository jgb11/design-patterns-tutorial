package com.jgb.designpatterns.template;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

public abstract class ConnectionTemplate {

    private static final Logger LOG = LogManager.getLogger(ConnectionTemplate.class);

    private boolean isLoggingEnable;

    public ConnectionTemplate() {
        isLoggingEnable = disableLogging();
    }

    public final void run() {

        setDBDriver();
        logging("Drivers set [" + new Date() + "]");
        setCredentials();
        logging("Credentails set [" + new Date() + "]");
        connect();
        logging("Conencted");
        prepareStatement();
        logging("Statement prepared [" + new Date() + "]");
        setData();
        logging("Data set [" + new Date() + "]");
        insert();
        logging("Inserted [" + new Date() + "]");
        close();
        logging("Conenctions closed [" + new Date() + "]");
        destroy();
        logging("Object destoryed [" + new Date() + "]");

    }

    public abstract void setDBDriver();

    public abstract void setCredentials();

    public void connect() {
        LOG.info("Setting connection...");
    }

    public void prepareStatement() {
        LOG.info("Preparing insert statement...");
    }

    public abstract void setData();

    public void insert() {
        LOG.info("Inserting data...");
    }

    public void close() {
        LOG.info("Closing connections...");
    }

    public void destroy() {
        LOG.info("Destroying connection objects...");
    }

    public boolean disableLogging() {
        return true;
    }

    private void logging(String msg) {
        if (isLoggingEnable) {
            LOG.info("Logging....: " + msg);
        }
    }
}
