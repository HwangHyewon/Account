package Hyewon;

public class CheckingAccount extends Account {
	
	private double credit_limit= 1000;
	private double interest;
	private double loan_interest;
	
	
	public void setInterest(double rate){
		interest = rate;
	}
	public double getInterest(){
		return interest;
	}
	public void setIoan_interest(double loan_rate){
		loan_interest = loan_rate;
	}
	public double getIoan_interest(){
		return loan_interest;
	}

	public void debit(double money){
		if(money<= credit_limit){
			balance = balance + money;
		}else{
			System.out.print("Please minus the debit money\n");
		}		
	}
	
	public void nextMonth(){
		if(balance >= 0){
			balance = balance * interest;
		}else{
			balance = balance * loan_interest;
		}
	}
}
	

	

