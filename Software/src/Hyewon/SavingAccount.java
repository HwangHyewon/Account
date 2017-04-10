package Hyewon;

import java.util.InputMismatchException;

public class SavingAccount extends Account implements Valuable {
	
	private double interest=0;
	private int time;
	
	SavingAccount(double bal, double interest) {
		super(bal);
		this.interest= interest;
	}
	
	@Override
	public void debit(double money)
		throws Exception ,InputMismatchException{
		if(money<0){
			throw new Exception("음수입력!");
		}
		if(time >=12){
			if(money>balance){
				throw new Exception("Debit amount exceeded account balance");
			}else{
				balance = balance - money;
			}
		}else{
			throw new Exception("아직 출급할 수 없습니다\n");
		}
	}

	@Override
	public double getWithdrawableAccount() {
		if(time>=12){
			return balance;
		}else{
			return 0.00;
		}
	}

	@Override
	public void passTime(int time) {
		this.time += time;
		if(this.time==12){
			balance = balance*Math.pow(1+interest, this.time);
		}
	}
	
	public double EstimateValue(int month){
		balance = balance*Math.pow(1+interest, month);
		return balance;
	}
	@Override
	public String toString(){
		return String.format("SavingAccount_Balance : %.2f ", balance);
	}
}
