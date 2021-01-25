/**
 * Create a Class SavingAccount with field's acc_balance, acc_ID,
 * accountHoldername, isSalaryAccount. Also add setter and getter
 * methods with business method like withdraw and deposit.
 * 
 * Create class BankAccountList which will maintain SavingAccount
 * objects. Ensure that this class should not allow duplicates as
 * well as data should be displayed in sorted order. (as per acc_ID).
 * 
 * @author dgarci11
 *
 */
public class Question9 {

	public static void main(String[] args) {
		BankAccountList list = new BankAccountList();
		list.addAccount(new SavingAccount(32393, 4, "Daniel", true));
		list.addAccount(new SavingAccount(34324, 4, "Daniel", true));
		list.addAccount(new SavingAccount(93, 1, "Liz", true));
		list.addAccount(new SavingAccount(2393, 3, "Joel", true));
		list.addAccount(new SavingAccount(393, 2, "Nataly", true));
		
		list.print();
	}

}
