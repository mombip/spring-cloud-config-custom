package com.test.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableConfigServer
public class ConfigManagerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigManagerAppApplication.class, args);
	}
}
