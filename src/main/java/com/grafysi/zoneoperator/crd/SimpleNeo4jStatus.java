package com.grafysi.zoneoperator.crd;

public class SimpleNeo4jStatus {

    private boolean running;
    private String externalIP;

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public String getExternalIP() {
        return externalIP;
    }

    public void setExternalIP(String externalIP) {
        this.externalIP = externa