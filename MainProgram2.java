import java.util.Scanner;

class MainProgram2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Account Number: ");
		int accNum = scanner.nextInt();
		System.out.print("Enter Account Type: ");
		String accType = scanner.next();
		System.out.print("Enter Current Balance: ");
		double curBalance = scanner.nextDouble();
		
		Account2 account = new Account2();		
		account.accountNumber = accNum;
		account.accountType = accType;
		account.availableBalance = curBalance;
		
		System.out.print("Enter Withdrawal Amount: INR ");
		int widAmt = scanner.nextInt();
		account.withdraw(widAmt);
		
		System.out.println();
		
		System.out.print("Enter Withdrawal Amount: INR ");
		widAmt = scanner.nextInt();
		account.withdraw(widAmt);
		
		System.out.println();
		
		System.out.print("Enter Withdrawal Amount: INR ");
		widAmt = scanner.nextInt();
		account.withdraw(widAmt);
		
	}
}