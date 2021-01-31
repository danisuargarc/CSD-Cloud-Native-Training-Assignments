package spring.core.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Write a Java program to demonstrate InitializingBean and DisposableBean. Try different ways: 
 * Use init-method and destroy-method in xml config file 
 * Use @PostConstruct and @PreDestroy
 * 
 * Write a Java program to demonstrate Complete Bean Life cycle.
 * 
 * @author dgarci11
 *
 */
public class Question8and9 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("q8and9.xml");
		context.registerShutdownHook();
		Customer customer1 = (Customer) context.getBean("customer");
		customer1.print();
	}
}
