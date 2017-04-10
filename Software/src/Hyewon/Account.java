package Hyewon;

import java.util.InputMismatchException;

public abstract class Account implements Valuable{

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
	

	public void debit (double money)
			throws Exception, InputMismatchException {
		if(balance >= money){
			balance = balance - money;
		}else{
			System.out.print("Debit amount exceeded the balance\n");
		}
	}
		
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int time);		
}
	
