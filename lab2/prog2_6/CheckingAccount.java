package lab2.prog2_6;


public class CheckingAccount extends Account {
	
	@Override
	public AccountType getAccType() {
		
		
		return AccountType.CHECKING;
		
	}
	
	public CheckingAccount(Employee employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}
		
	
	public CheckingAccount(Employee employee, double balance) {
		super(employee, balance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getBalance() {
		double bal = super.getBalance();
		double deduction = bal-5;
		
		return deduction;
	}

}
