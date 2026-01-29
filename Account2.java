import java.util.Scanner;

class Account2 {
	
	int accountNumber;
	String accountType;
	double availableBalance;
	
	void withdraw(int withdrawalAmount) {		
		availableBalance -= withdrawalAmount;
		
		System.out.println("Transaction Successful.");		
		
		checkBalance();
	}
	
	void deposit(int depositAmount) {
		availableBalance += depositAmount;
		
		System.out.println("Transaction Successful.");		

		checkBalance();
	}
	
	void checkBalance() {
		System.out.println("Current Balance: INR " + availableBalance);
	}
	
}