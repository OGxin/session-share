package com.ozx.sessionshare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession
public class SessionShareApplication {

	public static void main(String[] args) {
		SpringApplication.run(SessionShareApplication.class, args);
	}

}
