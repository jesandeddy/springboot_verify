package com.json007.springboot.starter.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: chao.an
 * @since: 2024-09-27 16:10
 */
@ConfigurationProperties(prefix = "demo.server")
public class DemoServerProperties {

    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
