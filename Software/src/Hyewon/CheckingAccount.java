package Hyewon;

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
	}
	
	
	@Override
	public void debit(double money){
		if(withdrawableMoney>=money ){
			balance = balance - money;
		}
	}
	
	@Override
	public double getWithdrawableAccount(){
		withdrawableMoney = balance + credit_limit;
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
		passTime(6);
		return balance;
	}
	@Override
	public String toString(){
		return String.format("CheckingAccount_Balance : %.2f ", balance);
	}
}
	

	

