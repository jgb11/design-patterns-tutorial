package com.jgb.designpatterns.template;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OracleTxtCon extends ConnectionTemplate {

    private static final Logger LOG = LogManager.getLogger(OracleTxtCon.class);

    @Override
    public void setDBDriver() {
        LOG.info("Setting Oracle DB drivers...");
    }

    @Override
    public void setCredentials() {
        LOG.info("Setting credentials for Oracle DB...");
    }

    @Override
    public void setData() {
        LOG.info("Setting up data from txt file....");
    }


}
