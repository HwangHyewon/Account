package Hyewon;

import java.util.InputMismatchException;

public class CheckingAccount extends Account implements Valuable {
	
	private double credit_limit;
	private double interest;
	private double loan_interest;
	private double withdrawableMoney;
	
	CheckingAccount(double bal, double credit_limit, double interest, double loan_interest){
		super(bal);
		this.credit_limit = credit_limit;
		this.interest = interest;
		this.loan_interest = loan_interest;
		withdrawableMoney = balance + credit_limit;
	}
	
	
	@Override
	public void debit(double money)
			throws Exception, InputMismatchException
		{
		if(money<0){
			throw new Exception("음수입력!");
		}
		if(withdrawableMoney<money){
			throw new Exception("Debit amount exceeded account balance");
		}else{
			balance = balance - money;
		}
	}
	
	@Override
	public double getWithdrawableAccount(){
		
		if(withdrawableMoney<=0){
			return 0;
		}else{
			return withdrawableMoney;
		}
	}
	
	@Override
	public void passTime(int time){
		if(balance>=0){
			balance = balance *(1+ (interest*time));
		}else{
			balance = balance*(1+ (loan_interest*time));
		}
	}
	
	public boolean isBankrupted(){
		if(balance<0){
			if(withdrawableMoney<=0){
				return false;
			}else{
				return true;
			}
		}else{
			return true;
		}
	}
	
	public double EstimateValue(int month){
		passTime(month);
		return balance;
	}
	@Override
	public String toString(){
		
		return String.format("CheckingAccount_Balance : %.2f ", balance);
	}
}
	

	

