package spring.security.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Design and develop a Spring Security application by using database authentication using JDBC with a custom login form
 * that limits the number of login attempts, implements "remember me" functionality, and secures the password by encoding it.
 * Use Role based login where user is redirected upon login based on their Role. Use BCryptPasswordEncoder and Hash-Based
 * Token Approach for "remember-me".
 * 
 * @author dgarci11
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAssignmentApplication.class, args);
	}

}
