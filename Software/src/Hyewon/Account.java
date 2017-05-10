package Hyewon;

import java.util.InputMismatchException;
import java.util.ArrayList;

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
		
	public static double sumForAccount(ArrayList<? extends Account> list){
		double sum = 0;
		for( Account account : list ){
			sum += account.getBalance();
		}
		return sum;
	}
	
	public static void passTimeForList (ArrayList<? extends Account> list, int month){
		for( Account account : list){
			account.passTime(month);
		}
	}
	
	public abstract double getWithdrawableAccount();
	public abstract double passTime(int time);
	public abstract double passTime(); 
	
}
	
