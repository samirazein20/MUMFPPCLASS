package lab2.prog2_6;

import java.util.*;

public class Employee {

//	private Account savingsAcct;
//	private Account checkingAcct;
//	private Account retirementAcct;
	private String name;
	private Date hireDate;
	private List<Account> accounts;

	public List<Account> getAccounts() {
		return accounts;
	}


	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
		accounts = new ArrayList<>();
	}

	
	public void createNewChecking(double startAmount) {
		Account acct = new CheckingAccount(this,startAmount);
		accounts.add(acct);

	}

	public void createNewSavings(double startingBalance) {
		Account acct = new SavingsAccount(this,startingBalance);
		accounts.add(acct);

	}

	public void createNewRetirement(double startAmount) {
		Account acct = new RetirementAccount(this,startAmount);
		accounts.add(acct);
	}

	public String getFormattedAcctInfo() {
		String newline = System.getProperty("line.separator");
		String theString = "ACCOUNT INFO FOR "+name+newline+newline;
//		if(!accounts.contains(acc)) theString += accounts.acc.toString()+newline;
//		if(savingsAcct != null) theString += savingsAcct.toString()+ newline;
//		if(retirementAcct != null) theString += retirementAcct.toString()+ newline;
		return theString;
	}
	public void deposit(int accountIndex, double amt){
		Account selected = accounts.get(accountIndex);
		selected.makeDeposit(amt);//notice the nice use of polymophism here
	}
	
	public boolean withdraw(int accountIndex, double amt){
		Account selected = accounts.get(accountIndex);
		return selected.makeWithdrawl(amt); //(Notice the nice use of polymorphism here.)
	}

}
