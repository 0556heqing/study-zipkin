package com.heqing.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author heqing
 * @date 2021/7/22 10:40
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
	}

}
