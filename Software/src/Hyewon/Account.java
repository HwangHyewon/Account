package Hyewon;

public class Account {

	protected double balance;
	protected double debit;
	
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
			
		
}
	
