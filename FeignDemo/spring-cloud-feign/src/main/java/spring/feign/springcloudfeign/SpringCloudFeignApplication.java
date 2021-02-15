package spring.feign.springcloudfeign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.feign.springcloudfeign.client.UserClient;
import spring.feign.springcloudfeign.dto.UserResponse;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SpringCloudFeignApplication {

	@Autowired
	private UserClient client;
	
	@RequestMapping("/findAllUser")
	public List<UserResponse> getAllUser() {
		return client.getUsers();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignApplication.class, args);
	}

}
