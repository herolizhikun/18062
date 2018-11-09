package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RunProviderApp {

	public static void main(String[] args) {
		
		SpringApplication.run(RunProviderApp.class, args);
	}

}
