/**
* Program Name: BankAccount.java
* Purpose: Create a bass class for which SavingAccout and ChequingAccount to derive
* Coder: Joshua Wright, 077530
* Date: June,7 2016
*/
public abstract class BankAccount 
{

	private String customerName;
	private String accountType;
	private String Month;

	public BankAccount() // no arf constructor
	{
		customerName = null;
		accountType = null;
		Month = null;
	}
	public BankAccount(String custName,String accTyoe, String month)// three arg constructor
	{
		customerName = custName;
		accountType = accTyoe;
		Month = month;
	}
	
	/**
	* Method Name: getCustomerName
	* Purpose: allow access to customerName
	* Parameters: none
	* Returns: String
	*/
	public String getCustomerName() {
		return customerName;
	}

	/**
	* Method Name: setCustomerName
	* Purpose: set customerName
	* Parameters: String
	* Returns: void
	*/
	public void setCustomerName(String customerNmae) {
		this.customerName = customerNmae;
	}

	/**
	* Method Name: getCustomerName
	* Purpose: allow access to AccountType
	* Parameters: none
	* Returns: String
	*/
	public String getAccountType() {
		return accountType;
	}

	/**
	* Method Name: setAccountType
	* Purpose: set AccountType
	* Parameters: String
	* Returns: Void
	*/
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

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
	
	public abstract String setAccountNumber();
	
	public abstract void deposit(double depositAmount,int  day);
	
	public abstract void withdrawal(double withdrawal,int  day);
	
	public abstract void calcInterest();
	
	public abstract void recordTransaction(int day,String transaction,double amount,double balance );
	
	public abstract void monthlyProcess();
	
	/**
	* Method Name: getCustomerName
	* Purpose: allow accces to customerName
	* Parameters: none
	* Returns: String
	*/
	public  String toString()
	{
		String temp = "************************************"+
					"\nCustomer Name:   " + customerName + "\n" +
					"Account Type:    " + accountType + "\n" + 
					"Current Month:   " + Month+"\n"+
					"************************************";
		return temp;
	}
	
}
