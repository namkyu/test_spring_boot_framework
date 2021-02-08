package com.example.demo.testframework.yml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
@ConfigurationProperties(prefix = "props")
public class YAMLProp {

    private String name;
    private String environment;
    private boolean enabled;
    private List<String> servers = new ArrayList<>();
    private List<String> cors = new ArrayList<>();
    private String[] cors2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<String> getServers() {
        return servers;
    }

    public void setServers(List<String> servers) {
        this.servers = servers;
    }

    public List<String> getCors() {
        return cors;
    }

    public void setCors(List<String> cors) {
        this.cors = cors;
    }

    public String[] getCors2() {
        return cors2;
    }

    public void setCors2(String[] cors2) {
        this.cors2 = cors2;
    }
}
