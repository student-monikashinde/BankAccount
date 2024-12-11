package account_management;

public class Account {
	private String accountHolderName;
	private String accountNumber;
	private double balance;

	Account(String accountHolderName, String accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void DisplayAccountDetails() {
		System.out.println("Enter Account Holder Name" + accountHolderName);
		System.out.println("Enter Account Number" + accountNumber);
		System.out.println("Enter Initial Balance" + balance);
	}
	public String getAccountNumber(){
		return accountNumber;
	}

	public void Deposite(double amount) {

		if (amount >= 0) {
			System.out.println("Deposited Amount Successfully!");
			balance += amount;
		} else {
			System.out.println("Plese Try Again.");
		}
	}

	public void Withdraw(double amount) {

		if (amount <= balance && amount >= 0) {
			System.out.println("Withdraw Amount Successfully!");
			balance -= amount;
		} else {
			System.out.println("Insuficient balance you can not withdraval.");
		}
	}

	public void UpdateAccount(String newname) {

		accountHolderName = newname;
		System.out.println("Enter New Acoount Holder Name:" + newname);

	}

}