package lab2.prog2_6;


public abstract class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private Employee employee;
	
	abstract public AccountType getAccType();

	public Account(Employee employee) {
		
		this(employee, DEFAULT_BALANCE);

	}

	public Account(Employee employee, double balance) {
		this.employee = employee;
		this.balance = balance;

	}
	
	Account(Employee emp, AccountType accType, double balance){
		employee = emp;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return null;
	}

	public void makeDeposit(double amount) {

	}

	public boolean makeWithdrawl(double amount) {

		return false;

	}

	

}
