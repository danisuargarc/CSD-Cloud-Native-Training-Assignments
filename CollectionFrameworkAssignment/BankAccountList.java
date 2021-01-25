import java.util.ArrayList;
import java.util.Comparator;

public class BankAccountList {

	private ArrayList<SavingAccount> accounts = new ArrayList<>();

	public void addAccount(SavingAccount account) {
		boolean exists[] = { false };
		accounts.forEach(account2 -> {
			if (account.getAcc_ID() == account2.getAcc_ID()) {
				exists[0] = true;
			}
		});
		if (!exists[0]) {
			accounts.add(account);
		}
	}

	public void print() {
		accounts.sort(new Comparator<SavingAccount>() {
			@Override
			public int compare(SavingAccount a1, SavingAccount a2) {
				int value = Integer.valueOf(a1.getAcc_ID()).compareTo(Integer.valueOf(a2.getAcc_ID()));

				return value;
			}
		});
		accounts.forEach(account -> System.out.println(account.toString()));
	}

}
