package com.jgb.designpatterns.proxy.remoteproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author txoppe
 * @since 21/10/2017 | 20:06
 */
public interface ReportGenerator extends Remote {

    String generateDailyReport() throws RemoteException;

}
