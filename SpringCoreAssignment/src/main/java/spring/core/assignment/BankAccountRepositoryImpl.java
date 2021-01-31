package spring.core.assignment;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public class BankAccountRepositoryImpl implements BankAccountRepository {

	private List<BankAccount> accounts;
	
	public BankAccountRepositoryImpl(List<BankAccount> accounts) {
		this.accounts = accounts;
	}

	@Bean
	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}

	@Override
	public double getBalance(long accountId) {
		for (BankAccount acc : accounts) {
	        if (acc.getAccountId() == accountId) {
	            return acc.getAccountBalance();
	        }
	    }
		
		return 0;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		for (BankAccount acc : accounts) {
	        if (acc.getAccountId() == accountId) {
	        	acc.setAccountBalance(newBalance);
	            return acc.getAccountBalance();
	        }
	    }
		
		return 0;
	}
	
}
