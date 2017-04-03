package Hyewon;

public class SavingAccount extends Account {
	
	private double interest=0;
	private int time;
	
	SavingAccount(double bal, double interest) {
		super(bal);
		this.interest= interest;
	}
	
	@Override
	public void debit(double money){
		if(time >=12){
			balance = balance - money;
		}else{
			System.out.print("아직 출급할 수 없습니다\n");
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
}
