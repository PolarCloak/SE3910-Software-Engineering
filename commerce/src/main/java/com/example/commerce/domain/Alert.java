package com.example.commerce.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String timestamp;

    private String hostname;

    private String appid;

    private String file;

    private String changeagent;

    private String changeprocess;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getChangeagent() {
        return changeagent;
    }

    public void setChangeagenet(String changeagent) {
        this.changeagent = changeagent;
    }

    public String getChangeprocess() {
        return changeprocess;
    }

    public void setChangeprocess(String changeprocess) {
        this.changeprocess = changeprocess;
    }
}
