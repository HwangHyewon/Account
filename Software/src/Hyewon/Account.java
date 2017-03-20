package Hyewon;

public class Account {

	private double balance;
	private double debit;
	
	public void getBalance(double money){
		balance = balance + money;
	}
	public double setBalance(){
		return balance;
	}

	public void getDebit (double withdrawl){
		debit = withdrawl;
	}
	public double setDebit(){
		return debit;
	}
	
	public double checkAccount(){
		if(balance>=debit){
			balance = balance - debit;
			return balance;
		}else{
			return -1;
		}
	}
}
	
