package com.json007.springboot.starter.autoconfigure;

import com.sun.net.httpserver.HttpServer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @author: chao.an
 * @since: 2024-09-27 16:09
 */
@Configuration
@EnableConfigurationProperties(DemoServerProperties.class)
public class DemoServerAutoConfiguration {

    @Bean
    @ConditionalOnClass(value = HttpServer.class)
    public HttpServer httpServer(DemoServerProperties serverProperties) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(serverProperties.getPort()), 0);
        server.start();
        return server;
    }
}
