import java.util.Scanner;

class Account{
	int accountNumber;
	String accountType;
	double availableBalance;
	
	void withDraw(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Withdrawal Amount: INR ");
		int withdrawalAmount = scanner.nextInt();
		
		availableBalance-=withdrawalAmount;
		System.out.println("Transaction Successful.");
		
		System.out.println("Current Balance: INR " + availableBalance);
	}
	void deposit(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Deposit Amount: INR ");
		int depositAmount = scanner.nextInt();
		
		availableBalance+=depositAmount;
		
		System.out.println("Amount Deposited is: INR " + depositAmount);
		
	}
	void checkBalance(){
		System.out.println("Current Balance is: INR " + availableBalance);
	}
}
