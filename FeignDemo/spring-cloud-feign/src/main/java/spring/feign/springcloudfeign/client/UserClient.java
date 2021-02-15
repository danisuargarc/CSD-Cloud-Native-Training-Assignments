package spring.feign.springcloudfeign.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.feign.springcloudfeign.dto.UserResponse;

@FeignClient(url="https://jsonplaceholder.typicode.com", name="USER-CLIENT")
public interface UserClient {
	
	@RequestMapping("/users")
	public List<UserResponse> getUsers();

}
