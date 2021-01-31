package spring.core.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Write a program to demonstrate use of @Resource, @Inject, @Required annotations
 * 
 * @author dgarci11
 *
 */
public class Question5 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("q5.xml");
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
	}
}
