package it.unibs.fp.bankaccount;

public class BankAccounto {

	private String owner;
	private double balance;
	public BankAccounto(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void whitdraw(double amount) {
		if(this.balance>=amount)
		this.balance -= amount;
		else
			System.out.println("Saldo insufficiente");
	}
	
	@Override
	public String toString() {
		String descrizione = "conto di "+owner+" -saldo: " + balance;
		return descrizione;
	}
}
