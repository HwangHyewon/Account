package Hyewon;

public abstract class Account {

	protected double balance;
	protected double debit;
	
	Account(double bal){
		balance = bal;
	}
	
	public void credit(double money){
		balance = balance + money;
	}
	public double getBalance(){
		return balance;
	}

	public void debit (double withdrawl){
		debit = withdrawl;
	}
	public double getDebit(){
		return debit;
	}
	
	protected double setBalance(){
		
		balance = balance - debit;
		return balance;
	}
	
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int time);		
}
	
