package com.tlsoft.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Configurable
@ConfigurationProperties(prefix = "hbase.conf")
@Component
public class HbaseConfig {
    private Map<String, String> configMap;

    public Map<String, String> getConfigMap() {
        return configMap;
    }

    public void setConfigMap(Map<String, String> configMap) {
        this.configMap = configMap;
    }
}
