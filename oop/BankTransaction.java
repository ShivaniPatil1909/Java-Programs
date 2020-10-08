package oop;

import exceptions.InsufficientBalanceException;

public interface BankTransaction {

	public abstract void deposite(double amount);
	void widthdraw(double amount) throws InsufficientBalanceException;
	double getBalance();
}
