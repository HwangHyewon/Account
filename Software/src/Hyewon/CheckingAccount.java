package Hyewon;

public class CheckingAccount extends Account {
	
	private double credit_limit= 1000;
	private double interest=1.01;
	private double loan_interest=1.07;
	
	
	public void loan (double money){
			if(money<= credit_limit){
				balance = balance + money;
				credit_limit = credit_limit - money;
				System.out.printf("Remained credit_limit is $%.2f\n", credit_limit);
			}else{
				System.out.print("Please minus the debit money\n The credit limit is $1000\n");
				
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
	

	

