package account_management;

import java.util.HashMap;
import java.util.Scanner;

public class BankingAccount_Main {

	private static HashMap<String, Account> accounts = new HashMap<String, Account>();

	public static void main(String[] args) {

		while (true) {
			System.out.println("Banking System Menu");
			Scanner scanner = new Scanner(System.in);

			System.out.println("1] Create Account :");
			System.out.println("2] Delete Account :");
			System.out.println("3] update Account :");
			System.out.println("4] Withdraw Money :");
			System.out.println("5] Deposite Money :");
			System.out.println("6] Display Acount Details :");
			System.out.println("7] Exit");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				createAccount(scanner);
				break;

			case 2:
				deleteAccount(scanner);
				break;

			case 3:
				updateAccount(scanner);
				break;

			case 4:
				withdrawMoney(scanner);
				break;

			case 5:
				depositeMoney(scanner);
				break;

			case 6:
				displayAccountDetails(scanner);
				break;

			case 7:
				System.out.println("Exit system menu.");
				return;

			default:
				System.out.print("Invalid option.Plese try again");
			}
		}
	}

	private static void createAccount(Scanner scanner) {

		System.out.println("Account Holder Person details are mandetory.");
		System.out.println();

		System.out.println("Enter account holder name :");
		String name = scanner.nextLine();
		System.out.println("Enter account number :");
		String number = scanner.nextLine();
		System.out.println("Enter initial balance :");
		double balance = scanner.nextDouble();
		System.out.println("Enter account type :");
		String type = scanner.nextLine();
		scanner.nextLine();
		System.out.println("Enter mobile number :");
		String mob_no = scanner.nextLine();
		System.out.println("Enter age :");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter city :");
		String city = scanner.nextLine();
		try {
			System.out.println("Enter Date Of Birth :");
			int dob = scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}

		Account account = new Account(name, number, balance);
		System.out.println("Created account successfully!");
		accounts.put(number, account);
	}

	private static void deleteAccount(Scanner scanner) {

		System.out.println("Enter account number to delete :");
		String number = scanner.nextLine();

		if (accounts.remove(number) != null) {
			System.out.println("Account deleted successfully!");
		} else {
			System.out.println("Account not fount.");
		}
		System.out.println();
	}

	private static void updateAccount(Scanner scanner) {

		System.out.println("Enter account number to update :");
		String number = scanner.nextLine();

		Account account = accounts.get(number);
		if (number != null) {
			System.out.println("Enter new account holder name :");
		} else {
			System.out.println("Account not fount.");
		}
		scanner.nextLine();
		System.out.println("Account successfully updated.");
		System.out.println();
	}

	private static void withdrawMoney(Scanner scanner) {

		System.out.println("Enter account number :");
		String number = scanner.nextLine();
		Account account = accounts.get(number);

		if (account != null) {
			System.out.println("Enter withdrawal money :");
			double amount = scanner.nextDouble();
			account.Withdraw(amount);
		} else {
			System.out.println("");
		}

	}

	private static void depositeMoney(Scanner scanner) {

		System.out.println("Enter account number :");
		String number = scanner.nextLine();
		Account account = accounts.get(number);

		if (account != null) {
			System.out.println("Enter deposite amount :");
			double amount = scanner.nextDouble();
			account.Deposite(amount);
		} else {
			System.out.println("Account not found.");
		}
	}

	private static void displayAccountDetails(Scanner scanner) {
		System.out.println("Enter account number :");
		String number = scanner.nextLine();
		Account account = accounts.get(number);
		
		if(account != null) {
			account.DisplayAccountDetails();
		}else {
			System.out.println("Account not found");
		}
	}
}