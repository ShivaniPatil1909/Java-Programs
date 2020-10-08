package oop;

import exceptions.InsufficientBalanceException;

public class BankAccount implements BankTransaction{

	private long accNumber;
	private double balance;
	
	private static long acNumber=1;
	
	
	public BankAccount(double balance) {
		//super();
		this.accNumber = acNumber;
		this.balance = balance;
		accNumber++;
	}

	@Override
	public void deposite(double amount) {
		balance+=amount;
	}

	@Override
	public void widthdraw(double amount) throws InsufficientBalanceException 
	{
		if(balance<amount)
		{
			InsufficientBalanceException e = 
					new InsufficientBalanceException();
			throw e;
			//()System.out.println(" Insufficient Balance");
			//throw exception
			//return;
		}
		balance-=amount;
	}

	@Override
	public double getBalance() {
		return balance;
	}
	
	public long getAccountNumber(){
		return accNumber;
	}
	
	public String toString(){
		return accNumber+", "+balance;
	}

}
