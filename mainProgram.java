class mainProgram{
	public static void main(String[] args){
		Account obj = new Account();
		obj.accountNumber = 1001;
		obj.accountType = "Savings";
		obj.availableBalance = 10000;
		
		obj.withDraw();
		obj.deposit();
		obj.checkBalance();
		
	}
}
