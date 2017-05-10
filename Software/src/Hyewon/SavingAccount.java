package Hyewon;

import java.util.InputMismatchException;

public class SavingAccount extends Account implements Valuable {
	
	private double interest=0;
	private int time=0;
	
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
	public double passTime(int time) {
		this.time += time;
		if(this.time==12){
			balance = balance*Math.pow(1+interest, this.time);
			return balance;
		}else{
			return 0.0;
		}
	}
	
	public double passTime() {
		this.time ++;
		if(this.time==12){
			return balance*Math.pow(1+interest, this.time);
		}else{
			return 0.0;
		}
	}
	
	public double EstimateValue(int month){
		return balance*Math.pow(1+interest, month);
	}
	
	public double EstimateValue(){
		return balance*Math.pow(1+interest, 1);
		
	}
	
	@Override
	public String toString(){
		return String.format("SavingAccount_Balance : %.2f ", balance);
	}
}
