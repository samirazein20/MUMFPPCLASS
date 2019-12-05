package lab2.Prog2_5;


public abstract class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;
	
	abstract public AccountType getAcctType();
	
	public Account(Employee emp){
		employee = emp;
	}
	
	public Account(Employee emp, double balance){
		employee = emp;
		this.balance = balance;
	}
	
	
	
//	Account(Employee emp, AccountType acctType){
//		//this(emp,acctType,DEFAULT_BALANCE);	
//		
//		
//	}
	public double getBalance() {
		return balance;
	}
	
//	public AccountType getAcctType() {
//		return acctType;
//	}
	public String toString() {
		String newline = System.getProperty("line.separator");
		return "Account type: "+ acctType.toString().toLowerCase()+
				newline +
				"Current bal: "+balance;
	}

	public void makeDeposit(double deposit) {
		balance += deposit;
	}
	public boolean makeWithdrawal(double amount) {
		if(amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}
}
