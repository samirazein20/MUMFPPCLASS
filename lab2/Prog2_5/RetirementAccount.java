package lab2.Prog2_5;

public class RetirementAccount extends Account {
	
	@Override
	public AccountType getAcctType() {
		
		return null;
	}
	
	public RetirementAccount(Employee emp){
		super(emp);
	}
	
	public RetirementAccount(Employee emp,double balance){
		super(emp, balance);
	}

}
