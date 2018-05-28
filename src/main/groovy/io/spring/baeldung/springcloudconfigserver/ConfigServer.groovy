package io.spring.baeldung.springcloudconfigserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class ConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class, args)
    }
}
