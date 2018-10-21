package me.gg.springbootadminserverdemo;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by sam on 18-10-21.
 */
@EnableAdminServer
@SpringBootApplication
public class SpringbootadminserverdemoApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootadminserverdemoApp.class, args);
    }
}
