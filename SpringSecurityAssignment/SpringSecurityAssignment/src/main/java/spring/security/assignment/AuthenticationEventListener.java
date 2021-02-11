package spring.security.assignment;

import java.sql.*;

import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Controller
public class AuthenticationEventListener {

	@EventListener
	public void authenticationFailed(AuthenticationFailureBadCredentialsEvent event) {

		String username = (String) event.getAuthentication().getPrincipal();

		try {
			String url = "jdbc:mysql://localhost:3306/springsecurity";
			Connection connection = DriverManager.getConnection(url, "root", "password");
			Statement statement = connection.createStatement();
			statement.executeUpdate("UPDATE users SET login_attempts = login_attempts + 1 WHERE username = \'" + username + "\'");
			statement.executeUpdate("UPDATE users SET loginAttempts = loginAttempts + 1 WHERE username = \'" + username + "\'");
			ResultSet result;

			result = statement.executeQuery("SELECT login_attempts FROM users WHERE username = \'" + username + "\'");
			while (result.next()) {
				int attempts = Integer.parseInt(result.getString("login_attempts"));

				if (attempts >= 5) {
					Statement updateStatement = connection.createStatement();
					updateStatement.executeUpdate("UPDATE users SET enabled = 0 WHERE username = \'" + username + "\'");
					System.out.println("(!) " + username + "'s account has been locked due to 5 or more failed login attempts.\n    Email has been sent to " + username + "'s email.");
				}
			}
			connection.close();
		} catch (Exception e) {
			System.err.println("(!) Exception in AuthenticationEventListener");
			System.err.println(e.getMessage());
		}

	}

}