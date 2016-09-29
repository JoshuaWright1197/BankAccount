/**
* Program Name: BankAccountTester.java
* Purpose: To test the ChequingAccount and SavingAccount Classes
* Coder: Joshua Wright, 077530
* Date: June,7 2016
*/
public class BankAccountTester {

	public static void main(String[] args) {
		
		// creating SavingAccount and ChequingAccount objects
		ChequingAccount account1 = new ChequingAccount("Bethany Anderson","March",2345);
		SavingAccount account2 = new SavingAccount("Bethany Anderson","March",6100);
		
		//testing account1's toString
		System.out.print(account1.toString());
		
		// testing account1's deposits and withdrawal methods
		account1.deposit(25.98, 5);
		account1.withdrawal(1300, 6);
		account1.withdrawal(1700, 10);
		account1.deposit(1050, 11);
		account1.withdrawal(1700, 11);
		account1.deposit(25.98, 25);
		account1.withdrawal(400, 26);
		account1.withdrawal(27.0, 28);
		account1.withdrawal(7.50, 28);
		
		// testing account1's monthlyProcess method
		account1.monthlyProcess();
		
		// testing account1's toString to see if changes applied
		System.out.print(account1.toString());
		
		//for spacing
		System.out.println();
		
		//testing account1's toString
		System.out.print(account2.toString());
		
		// testing account2's deposits and withdrawal methods
		account2.deposit(500, 3);
		account2.withdrawal(1000, 6);
		account2.deposit(250, 15);
		account2.withdrawal(3000, 21);
		account2.withdrawal(825, 28);
		account2.deposit(250, 29);
		
		// testing account2's monthlyProcess method
		account2.monthlyProcess();
		
		// testing account2's toString to see if changes applied
		System.out.print(account2.toString());
		
		
	}
}
	