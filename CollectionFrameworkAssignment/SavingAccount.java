
public class SavingAccount {

	private int acc_balance;
	private int acc_ID;
	private String accountHoldername;
	private boolean isSalaryAccount;
	
	public void withdraw(int amount) {
		acc_balance -= amount;
	}
	
	public void deposit(int amount) {
		acc_balance += amount;
	}
	
	public String toString() {
		return acc_ID + ", " + acc_balance + ", " + accountHoldername + ", " + isSalaryAccount;
	}
	
	public SavingAccount(int acc_balance, int acc_ID, String accountHoldername, boolean isSalaryAccount) {
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername;
		this.isSalaryAccount = isSalaryAccount;
	}
	public int getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
}
