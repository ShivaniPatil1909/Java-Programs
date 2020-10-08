package exceptions;

import oop.BankAccount;

public class BankAccountTest1 {

	public static void main(String[] args) {
		BankAccount ac1;
		ac1 = new BankAccount(1000);
		System.out.println(ac1);
		System.out.println("Deposit Rs. 100.00");
		ac1.deposite(100);
		System.out.println(ac1);
		System.out.println("Widthdraw Rs. 400.00");
		try{
			ac1.widthdraw(400);
			System.out.println(ac1);
			
			System.out.println("Widthdraw Rs. 1400.00");
			ac1.widthdraw(550);
			System.out.println(ac1);
		}catch(InsufficientBalanceException e){
			e.printStackTrace();
		}finally{
			System.out.println("In finally\n"+ac1);
		}
		System.out.println(ac1+"\nEnding main");
	}

}
