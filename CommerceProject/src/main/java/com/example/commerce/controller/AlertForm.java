package com.example.commerce.controller;

public class AlertForm {

    private String timestamp;
    private String hostname;
    private String application_id;
    private String file;
    private String change_agent;
    private String change_process;

    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public String getHostname() {
        return hostname;
    }
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    public String getApplication_id() {
        return application_id;
    }
    public void setApplication_id(String application_id) {
        this.application_id = application_id;
    }
    public String getFile() {
        return file;
    }
    public void setFile(String file) {
        this.file = file;
    }
    public String getChange_agent() {
        return change_agent;
    }
    public void setChange_agent(String change_agent) {
        this.change_agent = change_agent;
    }
    public String getChange_process() {
        return change_process;
    }
    public void setChange_process(String change_process) {
        this.change_process = change_process;
    }
}
