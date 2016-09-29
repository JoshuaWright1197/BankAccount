/**
* Program Name: Transaction.java
* Purpose: To create Transaction in memory
* Coder: Joshua Wright, 077530
* Date: June,7 2016
*/
public class Transaction 
{
	private String Month ,transaction;
	private double balance ,amount;
	private int day;
	
	/**
	* Method Name: getMonth
	* Purpose: allow access to Month
	* Parameters: none
	* Returns: String
	*/
	public String getMonth() {
		return Month;
	}
	
	/**
	* Method Name: SetMonth
	* Purpose: sets month
	* Parameters: String
	* Returns: void
	*/
	public void setMonth(String month) {
		Month = month;
	}
	
	/**
	* Method Name: getTransaction
	* Purpose: allows access to transaction
	* Parameters: String
	* Returns: void
	*/
	public String getTransaction() {
		return transaction;
	}
	
	/**
	* Method Name: SetTransaction
	* Purpose: sets Transaction
	* Parameters: String
	* Returns: void
	*/
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
	
	/**
	* Method Name: getBalance
	* Purpose: allows access to balance
	* Parameters: none
	* Returns: double
	*/
	public double getBalance() {
		return balance;
	}
	
	/**
	* Method Name: SetBalance
	* Purpose: sets Balance
	* Parameters: double
	* Returns: void
	*/
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	* Method Name: SetAmount
	* Purpose: allows access to amount
	* Parameters: none
	* Returns: String
	*/
	public double getAmount() {
		return amount;
	}
	
	/**
	* Method Name: SetAmount
	* Purpose: sets Amount
	* Parameters: double
	* Returns: void
	*/
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	/**
	* Method Name: SetDay
	* Purpose: allows access to day
	* Parameters: none
	* Returns: int
	*/
	public int getDay() {
		return day;
	}
	
	/**
	* Method Name: SetDay
	* Purpose: sets Day
	* Parameters: int
	* Returns: void
	*/
	public void setDay(int day) {
		this.day = day;
	}

	/**
	* Method Name: toString
	* Purpose: to represent the state of the object
	* Parameters: none
	* Returns: string
	*/
	public String toString()
	{
		String temp = String.format("%s %3d %-13s$%-10.2f %-11s $%.2f\n"
				,Month,day,transaction+":",amount,"Balance:",balance);
		return temp;
	}
	
}
