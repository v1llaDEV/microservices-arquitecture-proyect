package es.microservicios.v1lla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NamingServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamingServerEurekaApplication.class, args);
	}

}
