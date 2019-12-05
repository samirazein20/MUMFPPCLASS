package lab2.Prog2_5;

public class CheckingAccount extends Account{
	
	@Override
	public AccountType getAcctType() {
		
		return null;
	}
	
	public CheckingAccount(Employee emp){
		super(emp);
	}
	
	public CheckingAccount(Employee emp,double balance){
		super(emp, balance);
	}


}
