package spring.security.assignment;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;
	@Autowired
	UserDetailsService userDetailsService;
	private AuthenticationSuccessHandler authenticationSuccessHandler;
	
	@Autowired
    public void WebSecurityConfig(AuthenticationSuccessHandler authenticationSuccessHandler) {
        this.authenticationSuccessHandler = authenticationSuccessHandler;
    }
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// In-Memory Hard-Coded
		//auth.inMemoryAuthentication()
		//.withUser("admin").password("password").roles("ADMIN")
		//.and()
		//.withUser("user").password("password").roles("USER");
		
		// MySQL
		//auth.jdbcAuthentication()
		//.dataSource(dataSource)
		//.usersByUsernameQuery("SELECT username, password, enabled FROM USERS WHERE loginAttempts < 5 AND username = ?")
		//.authoritiesByUsernameQuery("SELECT username, role FROM USERS WHERE loginAttempts < 5 AND username = ?");
		
		// JPA and MySQL
		auth.userDetailsService(userDetailsService);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("USER", "ADMIN")
		.antMatchers("/").hasAnyRole("USER", "ADMIN")
		.and()
		.rememberMe().userDetailsService(userDetailsService)
		.and()
		.formLogin().loginPage("/login")
		.successHandler(authenticationSuccessHandler)
		.permitAll()
		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout", "GET"))
		.logoutSuccessUrl("/login?logout");
	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
