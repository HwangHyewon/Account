package Hyewon;

import java.util.InputMismatchException;

public class CheckingAccount extends Account implements Valuable {
	
	private double credit_limit;
	private double interest;
	private double loan_interest;
	private double withdrawableMoney ;
	
	CheckingAccount(double bal, double credit_limit, double interest, double loan_interest){
		super(bal);
		this.credit_limit = credit_limit;
		this.interest = interest;
		this.loan_interest = loan_interest;
		//withdrawableMoney = balance + credit_limit;
	}
	
	
	@Override
	public void debit(double money)
			throws Exception, InputMismatchException
		{
		if(money<0){
			throw new Exception("음수입력!");
		}
		if(balance + credit_limit<money){
			throw new Exception("Debit amount exceeded account balance");
		}else{
			balance = balance - money;
		}
	}
	
	@Override
	public double getWithdrawableAccount(){
		
		if(balance + credit_limit<=0){
			return 0;
		}else{
			return balance + credit_limit;
		}
	}
	
	@Override
	public double passTime(int time){
		if(balance>=0){
			balance = balance *(1+ (interest*(time))); 
			return balance ;
		}else{
			return balance*(1+ (loan_interest*(time)));
		}
	}
	
	public double passTime(){
		if(balance>0){
			return balance *(1+ (interest));
		}else{
			return balance*(1+ (loan_interest));
		}
	}
	
	public boolean isBankrupted(){
		if(getWithdrawableAccount()<=0){
			return true;
		}else{
			return false;
		}
	}
			
	
	public double EstimateValue(int month){
		return passTime(month);
	}
	
	public double EstimateValue(){
		return passTime();
	}
	@Override
	public String toString(){
		
		return String.format("CheckingAccount_Balance : %.2f ", balance);
	}
}
	

	

