package util;

public class Account {
	
	private final double TAX = 5.00;

	private int accountNumber;
	private String name;
	private double moneyAccount;
	
	//CONSTRUTORES
	
	public Account(int accountNumber, String name, double moneyAccount) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.moneyAccount = moneyAccount;
	}
	
	public Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.moneyAccount = 0;
	}
	
	//FIM CONSTRUTORES
	
	//EMCAPSULAMENTO
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMoneyAccount() {
		return moneyAccount;
	}
	
	//FIM EMCAPSULAMENTO
	
	public void deposit(double moneyAccount) {
		this.moneyAccount += moneyAccount;
	}
	
	public void withDreaw(double moneyAccount) {
		double discount = this.moneyAccount - moneyAccount;
		this.moneyAccount = discount - TAX;
	}
	
}
