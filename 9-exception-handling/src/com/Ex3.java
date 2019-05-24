package com;

/*
 * 
 * Throwable
 * 
 *   Exception
 *   
 *   Error
 * 
 * 
 */

class AccountBalanceException extends Exception {

	private String message;
	private double currentBalance;

	public AccountBalanceException(String message, double currentBalance) {
		super(message);
		this.message = message;
		this.currentBalance = currentBalance;
	}

	public String getMessage() {
		return message + "\t, current balance :" + currentBalance;
	}

}

//---------------------------------------------------

// TxrService module
//---------------------------------------------------

class TxrService {
	public boolean transfer(double amount, String fromAccNum, String toAccNum) throws AccountBalanceException {
		// Load from account
		double fromAccBalance = 1000.00;
		// Load to Account
		// ..
		if (fromAccBalance >= amount) {
			// ...
			return true;
		} else {
			throw new AccountBalanceException("insufficient funds", fromAccBalance);
//			return false;
//			throw new Error();
		}

	}
}

//---------------------------------------------------
//Booking module
//---------------------------------------------------

class Booking {
	private TxrService txrService = new TxrService();

	public void bookTicket(double amount, String fromAccNum) {
		try {
			boolean b = txrService.transfer(amount, fromAccNum, "12345678");
			System.out.println("booking successful : will email tickets");
		} catch (AccountBalanceException e) {
			System.out.println("booking failed : " + e.getMessage());
		}
	}
}

//---------------------------------------------------

public class Ex3 {

	public static void main(String[] args) {

		Booking booking = new Booking();
		booking.bookTicket(5000.0, "1112222");

	}

}
