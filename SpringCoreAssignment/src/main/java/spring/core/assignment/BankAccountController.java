package spring.core.assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class BankAccountController implements BankAccountService {
	BankAccountRepositoryImpl repo;
	
	//to change the autowire type, visit the end of line 33 in q3.xml
	//make sure to comment out the constructor below to autowire by byName or byType
	public BankAccountController(BankAccountRepositoryImpl repo) { this.repo = repo; }

	@Bean
	public BankAccountRepositoryImpl getRepo() {
		return repo;
	}

	public void setRepo(BankAccountRepositoryImpl repo) {
		this.repo = repo;
	}

	@Override
	public double withdraw(long accountId, double balance) {
		for (BankAccount acc : repo.getAccounts()) {
	        if (acc.getAccountId() == accountId) {
	        	acc.setAccountBalance(acc.getAccountBalance() - balance);
	            return acc.getAccountBalance();
	        }
	    }
		
		return 0;
	}

	@Override
	public double deposit(long accountId, double balance) {
		for (BankAccount acc : repo.getAccounts()) {
	        if (acc.getAccountId() == accountId) {
	        	acc.setAccountBalance(acc.getAccountBalance() + balance);
	            return acc.getAccountBalance();
	        }
	    }
		
		return 0;
	}

	@Override
	public double getBalance(long accountId) {
		for (BankAccount acc : repo.getAccounts()) {
	        if (acc.getAccountId() == accountId) {
	            return acc.getAccountBalance();
	        }
	    }
		
		return 0;
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		withdraw(fromAccount, amount);
		deposit(toAccount, amount);
		
		return true;
	}

	public void printRepo() {
		System.out.println("\nPrinting repo:");
		for (BankAccount acc : repo.getAccounts()) {
	        System.out.println(acc.getAccountId() + " - " + acc.getAccountHolderName() + " - $" + acc.getAccountBalance());
	    }
	}
}
