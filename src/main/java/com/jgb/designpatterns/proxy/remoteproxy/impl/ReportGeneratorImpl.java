package com.jgb.designpatterns.proxy.remoteproxy.impl;

import com.jgb.designpatterns.proxy.remoteproxy.ReportGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

/**
 * @author txoppe
 * @since 21/10/2017 | 20:09
 */
public class ReportGeneratorImpl extends UnicastRemoteObject implements ReportGenerator {

    private static final long serialVersionUID = 3107413009881629428L;

    private static final Logger LOG = LogManager.getLogger(ReportGeneratorImpl.class);

    protected ReportGeneratorImpl() throws RemoteException {
    }

    @Override
    public String generateDailyReport() throws RemoteException {
        StringBuilder sb = new StringBuilder();
        sb.append("********************Location X Daily Report********************");
        sb.append("\\n Location ID: 012");
        sb.append("\\n Today's Date: " + new Date());
        sb.append("\\n Total Pizza's Sell: 112");
        sb.append("\\n Total Price: $2534");
        sb.append("\\n Net Profit: $1985");
        sb.append("\\n ***************************************************************");

        return sb.toString();
    }

    public static void main(String[] args) {

        try {
            ReportGenerator reportGenerator = new ReportGeneratorImpl();
            Naming.rebind("PizzaCoRemoteGenerator", reportGenerator);
        } catch (RemoteException | MalformedURLException e) {
            LOG.error("Error running the report.", e);
        }

    }

}