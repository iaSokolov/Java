package vtb.geekbrains.market.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
public class MarketConfigurationServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(MarketConfigurationServerApplication.class, args);
	}
}
