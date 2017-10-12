package com.example.demo;

import com.example.demo.filter.CustomZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class GatewayEndpoint {

	public static void main(String[] args) {
		SpringApplication.run(GatewayEndpoint.class, args);
	}

	@Bean
	public CustomZuulFilter customZuulFilter(){
		return new CustomZuulFilter();
	}
}
