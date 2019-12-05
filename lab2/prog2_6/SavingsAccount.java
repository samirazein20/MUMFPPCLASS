package lab2.prog2_6;


public class SavingsAccount extends Account{
	
	@Override
	public AccountType getAccType() {
		
		return AccountType.SAVINGS;
		
	}
	
	@Override
	public double getBalance() {
		double bal = super.getBalance();
		double interest = (0.25/100)*bal;
		
		return bal + interest;
	}
	
	public SavingsAccount(Employee employee) {
		super(employee);
		
	}
	
	
	public SavingsAccount(Employee employee, double balance) {
		super(employee,balance);
		
	}
	


}
