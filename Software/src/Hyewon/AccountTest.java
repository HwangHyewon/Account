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
		
		
		
	}
}