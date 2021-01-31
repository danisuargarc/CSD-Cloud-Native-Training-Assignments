package spring.core.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create a Question3 class with main() method, get BankAccountController bean object from 
 * ApplicationContext and perform the following operations:
 * 
 * public double withdraw(long accountId, double balance)
 * public double deposit(long accountId, double balance)
 * public double getBalance(long accountId)
 * public boolean fundTransfer(long fromAccount, long toAccount, double amount)
 * 
 * from implementations in classes/interfaces 
 * 
 * BankAccount
 * BankAccountRepository
 * BankAccountRepositoryImpl
 * BankAccountService
 * BankAccountController
 * 
 * Perform autowiring with different types (byName, byType, and constructor). Use one type at a time.
 * 
 * Example of @Controller, @Service, @Repository, @Configuration, and @Bean
 * 
 * @author dgarci11
 *
 */
public class Question3and4 {

	public static void main(String[] args) {
		//to demonstrate autowiring, visit lines 6-8 in BankAccountService.java
		
		ApplicationContext context = new ClassPathXmlApplicationContext("q3and4.xml");
		BankAccountController controller = (BankAccountController) context.getBean("controller");
		controller.printRepo();
		controller.withdraw(102, 500);
		System.out.println("\n102 after withdrawal of $500: " + controller.getBalance(102));
		controller.deposit(102, 5500);
		System.out.println("102 after deposit of $5500: " + controller.getBalance(102));
		controller.fundTransfer(101, 103, 500);
		System.out.println("101 transfer of $500 to 103");
		controller.printRepo();
	}

}
