package spring.core.assignment;

import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService {
	BankAccountRepositoryImpl repo;
	
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

}
