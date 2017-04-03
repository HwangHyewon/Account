package Hyewon;

public abstract class Account {

	protected double balance;
	
	Account(double bal){
		balance = bal;
	}
	
	public void credit(double money){
		balance = balance + money;
	}
	public double getBalance(){
		return balance;
	}
	

	public void debit (double money){
		if(balance >= money){
			balance = balance - money;
		}else{
			System.out.print("Debit amount exceeded the balance\n");
		}
	}
		
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int time);		
}
	
