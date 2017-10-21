package com.jgb.designpatterns.proxy.remoteproxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author txoppe
 * @since 21/10/2017 | 20:43
 */
@SuppressWarnings("squid:S1313")
public class ReportGeneratorClient {

    private static final Logger LOG = LogManager.getLogger(ReportGeneratorClient.class);

    public static void main(String[] args) {
        new ReportGeneratorClient().generateReport();
    }

    private void generateReport() {
        try {
            ReportGenerator reportGenerator = (ReportGenerator) Naming.lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator");
            LOG.info(reportGenerator.generateDailyReport());
        } catch (RemoteException | NotBoundException | MalformedURLException e) {
            LOG.error("Error getting the report.", e);
        }
    }

}
