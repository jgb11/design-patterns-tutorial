package com.jgb.designpatterns.template;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MySqLCSVCon extends ConnectionTemplate {

    private static final Logger LOG = LogManager.getLogger(ConnectionTemplate.class);

    @Override
    public void setDBDriver() {
        LOG.info("Setting MySQL DB drivers...");
    }

    @Override
    public void setCredentials() {
        LOG.info("Setting credentials for MySQL DB...");
    }

    @Override
    public void setData() {
        LOG.info("Setting up data from csv file....");
    }

    @Override
    public boolean disableLogging() {
        return false;
    }

}
