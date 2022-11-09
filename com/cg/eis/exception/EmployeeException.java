package com.cg.eis.exception;

/*Create an Exception class named as "Employee Exception" (User defined exception) in a
 * package named as "com.cg.eis.exception" and throw an exception if salary of an 
 * employee is below than 3000. Use Exception Handling 
 * mechanism to handle exception properly.
 */

import java.util.Scanner;

public class EmployeeException {

   public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount < 3000) {
            System.out.println(amount);
            throw new InsufficientBalanceException("Insufficient Balance");
        } else  {
            System.out.println("Amount withdrawnnn sucessfully");
        }
    }

   public static void main(String[] a){
        
        System.out.println("Enter salary");
        try {
            EmployeeException mc = new EmployeeException();
            Scanner sc = new Scanner(System.in);
            int amount = sc.nextInt();
            mc.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

}

class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String message) {
		super(message);
	}
}