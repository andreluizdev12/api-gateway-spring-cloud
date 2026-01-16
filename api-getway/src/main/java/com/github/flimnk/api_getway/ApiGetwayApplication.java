package com.github.flimnk.api_getway;

import com.github.flimnk.api_getway.config.UriConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import reactor.netty.http.client.HttpClient;

@SpringBootApplication
@EnableConfigurationProperties(UriConfiguration.class)
public class ApiGetwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGetwayApplication.class, args);
	}

}
