package lab2.Prog2_5;

public class SavingsAccount extends Account{
	
	@Override
	public AccountType getAcctType() {
		
		return null;
	}
	
	public SavingsAccount(Employee emp){
		super(emp);
	}
	
	public SavingsAccount(Employee emp,double balance){
		super(emp, balance);
	}

}
