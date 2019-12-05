package lab2.Prog2_5;

import java.util.Date;
import java.util.*;
import java.util.GregorianCalendar;

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
	}

	
	public void createNewChecking(double startAmount) {
		
		Account acc = new SavingsAccount(this, startAmount);
		
		accounts.add(acc);
	}

	public void createNewSavings(double startAmount) {
		Account savingsAcct = new SavingsAccount(this, startAmount);
		
		accounts.add(savingsAcct);
	}

	public void createNewRetirement(double startAmount) {
		Account retirementAcct = new RetirementAccount(this, startAmount);
		
		accounts.add(retirementAcct);
		
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
		return selected.makeWithdrawal(amt);
		
	}

}
