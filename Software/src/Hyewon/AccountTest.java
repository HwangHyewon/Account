package Hyewon;
import java.util.Scanner;
public class AccountTest {
	public static void main(String[] args){
		CheckingAccount account1 = new CheckingAccount(100,50,0.01,0.07);
		//Account account2 = new SavingAccount(100,0.05);
		
		//CheckingAccount
		Scanner scan = new Scanner(System.in);
		double amount;
		
		System.out.printf("Account1 balance: $ %.2f	\t������ݰ��ɾ�: %.2f\n",
				account1.getBalance(),account1.getWithdrawableAccount());
		System.out.println("Enter withdrawal amount for Account1: ");
		amount = scan.nextDouble();
		account1.debit(amount);
		System.out.printf("Account1 balance: $ %.2f	\t������ݰ��ɾ�: %.2f\n",
				account1.getBalance(),account1.getWithdrawableAccount());
		if(account1.isBankrupted()==false){
			System.out.print("BROKEN\n");
		}
		account1.passTime(1);
		System.out.printf("Account1 balance: $ %.2f	\t������ݰ��ɾ�: %.2f\n",
				account1.getBalance(),account1.getWithdrawableAccount());
		if(account1.isBankrupted()==false){
			System.out.print("BROKEN\n");
		}
		account1.passTime(5);
		System.out.printf("Account1 balance: $ %.2f	\t������ݰ��ɾ�: %.2f\n",
				account1.getBalance(),account1.getWithdrawableAccount());
		if(account1.isBankrupted()==false){
			System.out.print("BROKEN\n");
		}
	}
}