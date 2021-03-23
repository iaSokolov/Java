package vtb.geekbrains.market.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MarketConfigClientApplication {

	public static void main(String[] args) {

		SpringApplication.run(MarketConfigClientApplication.class, args);
	}

}
