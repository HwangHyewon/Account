package Hyewon;
import java.util.Scanner;
public class AccountTest {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		Account account1 = new Account();
		Account account2 = new Account();
		 
		 System.out.print("account1 balance: ");
		 double money1 = input.nextDouble();
		 account1.getBalance(money1);
		 System.out.print("account2 balance: ");
		 double money2 = input.nextDouble();
		 account2.getBalance(money2);
		 

		 System.out.print("Enter withdrawal amount for account1: ");
		 double debit1 = input.nextDouble();
		 account1.getDebit(debit1);
		 
		 System.out.printf("substracting $%.2f from account1 balance.\n", account1.setDebit());
		 
		 double balance1 = account1.checkAccount();
		 if(balance1>=0){
			 System.out.printf("account1 balance: $%.2f\n",balance1); 
		 }else{
			 System.out.print("Debit amount exceeded account1 balance\n");
		 }
		 
		 System.out.printf("account2 balance: $%.2f\n",account2.setBalance());
		 
		 System.out.print("Enter withdrawal amount for account2: ");
		 double debit2 =input.nextDouble();
		 account2.getDebit(debit2);
		 System.out.printf("substracting $%.2f from account1 balance.\n", account2.setDebit());
		 
		 double balance2 = account2.checkAccount();
		 System.out.printf("account1 balance: $%.2f\n",balance1);
		 if(balance2>=0){
			 System.out.printf("account2 balance: $%.2f\n",balance2); 
		 }else{
			 System.out.print("Debit amount exceeded account2 balance\n");
		 }
	}

}
