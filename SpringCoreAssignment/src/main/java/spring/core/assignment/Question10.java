package spring.core.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Write a Java program to demonstrate ApplicationContextAware interface.
 * 
 * @author dgarci11
 *
 */
public class Question10 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("q10.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}
}
