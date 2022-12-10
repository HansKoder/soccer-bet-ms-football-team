package com.hans.soccer.bet.msfootballteam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsFootballteamApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsFootballteamApplication.class, args);
	}

}
