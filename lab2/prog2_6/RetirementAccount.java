package lab2.prog2_6;


public class RetirementAccount extends Account{
	
	public RetirementAccount(Employee employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}
		
	
	public RetirementAccount(Employee employee,double balance) {
		super(employee, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AccountType getAccType() {
		
		return AccountType.RETIREMENT;
		
	}
	
	@Override
	public double getBalance() {
		double bal = super.getBalance();
		double penalty = (2/100)*bal;
		
		return bal-penalty;
	}


}
