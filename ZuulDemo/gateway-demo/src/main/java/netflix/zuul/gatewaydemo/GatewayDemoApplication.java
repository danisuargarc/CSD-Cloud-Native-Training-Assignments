package netflix.zuul.gatewaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayDemoApplication.class, args);
	}

}
