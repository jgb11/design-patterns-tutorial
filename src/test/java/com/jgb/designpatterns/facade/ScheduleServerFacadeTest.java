package com.jgb.designpatterns.facade;

import com.jgb.designpatterns.facade.scheduleserverapi.ScheduleServer;
import com.jgb.designpatterns.facade.scheduleserverapi.ScheduleServerImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jgb
 * @since 8/25/17 9:49 AM
 */
public class ScheduleServerFacadeTest {

    private ScheduleServer scheduleServer;

    @Before
    public void setUp() throws Exception {
        scheduleServer = new ScheduleServerImpl();
    }

    @Test
    public void testOldScheduleServer() throws Exception {

        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();

        System.out.println("Start working......");
        System.out.println("After work done.........");

        scheduleServer.releaseProcesses();
        scheduleServer.destroy();
        scheduleServer.destroySystemObjects();
        scheduleServer.destroyListeners();
        scheduleServer.destroyContext();
        scheduleServer.shutdown();
    }

    @Test
    public void testFacadeScheduleServer() throws Exception {
        ScheduleServerFacade facadeServer = new ScheduleServerFacade(scheduleServer);
        facadeServer.startServer();

        System.out.println("Start working......");
        System.out.println("After work done.........");

        facadeServer.stopServer();

    }
}