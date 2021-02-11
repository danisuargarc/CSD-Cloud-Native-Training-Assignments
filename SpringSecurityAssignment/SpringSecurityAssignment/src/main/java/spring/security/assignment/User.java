package spring.security.assignment;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="enabled", nullable=true)
	private int enabled;
	@Column(name="loginAttempts", nullable=true)
	private int loginAttempts;
	@Column(name="role", nullable=true)
	private String role;
	
	public User() {
		
	}

	public User(String username, String password, int enabled, int loginAttempts, String role) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.loginAttempts = loginAttempts;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int isEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	public int getLoginAttempts() {
		return loginAttempts;
	}
	public void setLoginAttempts(int loginAttempts) {
		this.loginAttempts = loginAttempts;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
