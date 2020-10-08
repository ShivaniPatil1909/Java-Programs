package exceptions;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() {
		super("Insufficient Balance in account");
	}
	
	public InsufficientBalanceException(String msg){
		super(msg);
	}
}
