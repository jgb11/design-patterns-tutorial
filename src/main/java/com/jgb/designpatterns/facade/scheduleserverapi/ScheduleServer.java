package com.jgb.designpatterns.facade.scheduleserverapi;

/**
 * @author jgb
 * @since 8/25/17 9:11 AM
 */
public interface ScheduleServer {
    void startBooting();

    void readSystemConfigFile();

    void init();

    void initializeContext();

    void initializeListeners();

    void createSystemObjects();

    void releaseProcesses();

    void destroy();

    void destroySystemObjects();

    void destroyListeners();

    void destroyContext();

    void shutdown();
}
