package spr.design.partterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class PartternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartternsApplication.class, args);
	}

}
