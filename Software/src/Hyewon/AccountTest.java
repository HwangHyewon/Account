package Hyewon;
import java.util.Scanner;
public class AccountTest {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		CheckingAccount account1 = new CheckingAccount();
		CheckingAccount account2 = new CheckingAccount();
		
		System.out.print("Account1 balance: ");
		double balance1 = input.nextDouble();
		account1.credit(balance1);
		
		System.out.print("Account2 balance: ");
		double balance2 = input.nextDouble();
		account2.credit(balance2);
		
		System.out.print("Enter deposit amount for Account1:");
		double loan1 = input.nextDouble();
		account1.loan(loan1);
		
		System.out.print("Enter deposit amount for Account2:");
		double loan2 = input.nextDouble();
		account2.loan(loan2);
		
		System.out.printf("Account1 balance: $%.2f \n",account1.getBalance());
		System.out.printf("Account1 balance: $%.2f \n",account2.getBalance());
		
		System.out.print("Enter withdrawal amount for Account1:");
		double debit1 = input.nextDouble();
		account1.debit(debit1);
		
		System.out.print("Enter withdrawal amount for Account2:");
		double debit2 = input.nextDouble();
		account2.debit(debit2); 
		
		account1.setBalance();
		account2.setBalance();
		
		System.out.printf("Account1 balance: $%.2f \n",account1.getBalance());
		System.out.printf("Account2 balance: $%.2f \n",account2.getBalance());
		
		account1.nextMonth();
		account2.nextMonth();
		
		System.out.print("Next Month\n");
		System.out.printf("Account1 balance: $%.2f \n",account1.getBalance());
		System.out.printf("Account2 balance: $%.2f \n",account2.getBalance());
		
		
	}
}