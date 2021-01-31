package spring.core.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Example of @Component, @Value, @PropertySource, & Environment 
 * a. Create a dbConfig.properties file which contains database configuration details like driver class 
 * name, dburl, username, and password. 
 * b. Create a Java class in which you have to read all properties and display on a console. (Use 
 * @Component, @Value, or Environment and @PropertyResource)
 * 
 * @author dgarci11
 *
 */
public class Question6 {
	public static void main(String[] args) {
		//make sure only Question6.java and DBConnection.java are in this package when you run main!!!

		ApplicationContext context = new ClassPathXmlApplicationContext("q6.xml");
		DBConnection dbconn = (DBConnection) context.getBean("dbconn");
		dbconn.print();
	}
}
