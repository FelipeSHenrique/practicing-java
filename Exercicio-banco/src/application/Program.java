package application;

import java.util.Locale;
import java.util.Scanner;

import util.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		
		boolean status = false;
		Account acc = null;
		
		while (status == false) {
			
			System.out.print("Is there na initial deposit (y/n)?");
			String alternative = sc.nextLine();
			
			switch (alternative) {
				case "y":
				case "Y":
					System.out.println("Enter initial deposit value:");
					double moneyAccount = sc.nextDouble();
					acc = new Account(accountNumber, name, moneyAccount);
					status = true;
					break;
				case "n":
				case "N":
					acc = new Account(accountNumber, name);
					status = true;
					break;
				default:
					System.out.println("ERROR");
			}
			
		}
		
		System.out.println("Account data:");
		System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f%n%n", acc.getAccountNumber(), acc.getName(), acc.getMoneyAccount());
		
		//DEPOSIT
		
		System.out.println("Enter a deposit value:");
		double moneyAccount = sc.nextDouble();
		acc.deposit(moneyAccount);
		
		System.out.println("Updated account data:");
		System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f%n%n", acc.getAccountNumber(), acc.getName(), acc.getMoneyAccount());
		
		//FIM DEPOSIT
		
		//WITHDREAW
		
		System.out.println("Enter a withdraw value:");
		moneyAccount = sc.nextDouble();
		acc.withDreaw(moneyAccount);
		
		System.out.println("Updated account data:");
		System.out.printf("Account: %d, holder: %s, Balance: $ %.2f%n%n", acc.getAccountNumber(), acc.getName(), acc.getMoneyAccount());
		
		//FIM WITHDREAW
		
		sc.close();

	}

}
