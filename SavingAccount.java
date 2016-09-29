import java.util.ArrayList;
/**
* Program Name: SavingAccount.java
* Purpose: To create SavingAccount in memory
* Coder: Joshua Wright, 077530
* Date: June,7 2016
*/
public class SavingAccount extends BankAccount
{
	private String accountNumber;
	private int numberWithdrawals,numberDeposits;
	private double balance;
	private boolean accountActive;
	private static double INT_RATE = 0.03;
	private ArrayList<Transaction> record;

	
	public SavingAccount()// no arg constructor
	{
		super();
		balance = 0.0;
		accountActive = false;
		numberWithdrawals = 0;
		numberDeposits = 0;
		record = new ArrayList<Transaction>();
	}
	public SavingAccount(String custName, String month ,double  bal) // three arg constructor
	{
		super(custName,"Saving",month);
		balance = bal;
		accountNumber = setAccountNumber();
		isAccountActive();
		record = new ArrayList<Transaction>();
	}
	
	/**
	* Method Name: getAccountNumber
	* Purpose: allow access to AccountNumber
	* Parameters: none
	* Returns: String
	*/
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	* Method Name: getNumberWithdrwals
	* Purpose: allow access to NumberWithdrwals
	* Parameters: none
	* Returns: int
	*/
	public int getNumberWithdrawals() {
		return numberWithdrawals;
	}

	/**
	* Method Name: getDeposits
	* Purpose: allow access to NumberDeposits
	* Parameters: none
	* Returns: int
	*/
	public int getNumberDeposits() {
		return numberDeposits;
	}

	/**
	* Method Name: getBalance
	* Purpose: allow access to Balance
	* Parameters: none
	* Returns: Double
	*/
	public double getBalance() {
		return balance;
	}

	/**
	* Method Name: IsAccountActive
	* Purpose: To test if account is active
	* Parameters: none
	* Returns: boolean
	*/
	public boolean isAccountActive() {
		if(balance < 25.00)
		{
			accountActive = false;
		}
		else 
		accountActive = true;
		return accountActive;
	}

	/**
	* Method Name: getINT_RATE
	* Purpose: allow access to INT_RATE
	* Parameters: none
	* Returns: double
	*/
	public static double getINT_RATE() {
		return INT_RATE;
	}

	/**
	* Method Name: setAccountNumber
	* Purpose: To set the account number
	* Parameters: none
	* Returns: String
	*/
	public String setAccountNumber() {
		
		char[] temp = new char[5];
		String numberF;
		int generated = 0;
		
		for(int i = 0; i < 5; i++)
		{
			generated  = (int)(Math.random() *(9 - 0 + 0) + 0);
			temp[i] = Integer.toString(generated).charAt(0);
		}
		
		String Mnumber = new String(temp);
		 numberF = "002-623490-"+Mnumber+"-575";
		return numberF;
	}

	/**
	* Method Name: deposit
	* Purpose: To create a deposit
	* Parameters: double,int
	* Returns: void
	*/
	public void deposit(double depositAmount, int day) {
		isAccountActive();
		balance += depositAmount;
		recordTransaction(day,"Deposit",depositAmount,balance);
		numberDeposits++;
	}

	/**
	* Method Name: withdrawal
	* Purpose: To create a wihdrawal
	* Parameters: double,int
	* Returns: void
	*/
	public void withdrawal(double withdrawal, int day) {
		String transactionMessage = null;
		
		if((balance-withdrawal) > 0.0 && isAccountActive() == true )
		{
		balance =balance-withdrawal;
		transactionMessage = "Withdrawal";
		numberWithdrawals++;
		}
		else if(isAccountActive()== false)
		{
		transactionMessage = "Transaction cancelled. Account is inactive.";
		}
		else if((balance-withdrawal) < 0.0 && isAccountActive() == true )
		{
			transactionMessage = "Transaction cancelled. Insufficient funds";
		}
		recordTransaction(day,transactionMessage,withdrawal,balance);
		isAccountActive();
	}

	/**
	* Method Name: calcIntrest
	* Purpose: To calculate the interest of the account
	* Parameters: none
	* Returns: void
	*/
	public void calcInterest() {
		double MIR = 0.0;
		double MI = 0.0;
		
		MIR = INT_RATE /(double)12;
		if(isAccountActive() == true)
		{
			MI = MIR*balance;
			balance +=MI;
		}	
		recordTransaction(31,"Interest",MI,balance);
	}

	/**
	* Method Name: RecordTransaction
	* Purpose: To create a transaction object
	* Parameters: int,String,double,double
	* Returns: void
	*/
	public void recordTransaction(int day, String transaction, double amount, double balance) {
		Transaction trans = new Transaction();
		record.add(trans);
		trans.setDay(day);
		trans.setMonth(super.getMonth());
		trans.setAmount(amount);
		trans.setBalance(balance);
		trans.setTransaction(transaction);
	}

	/**
	* Method Name: printTransactions
	* Purpose: To print the transactions for the month
	* Parameters: none
	* Returns: void
	*/
	public void printTransactions(){
		System.out.printf("*******************************************\n");
		System.out.print("Transaction Record for the Month of "+super.getMonth()+"\n");
		System.out.printf("*******************************************\n");
	
			for(int i = 0;i < record.size()-1;i++)
			{
			System.out.print(record.get(i));
			}
			
			System.out.print("\nTotal Deposits:  "+numberDeposits+
			"\nTotal Withdrawals:   "+numberWithdrawals+"\n");
			
			for(int i = record.size()-1;i < record.size();i++)
			{
			System.out.print(record.get(i)+"\n");
			}
	}
	
	/**
	* Method Name: MonthlyProcess
	* Purpose: To calculate print end of month transactions
	* Parameters: none
	* Returns: void
	*/
	public void monthlyProcess() {
		calcInterest();
		printTransactions();
		numberWithdrawals = 0;
		numberDeposits = 0;
		record.clear();
		isAccountActive();
	}
	
	/**
	* Method Name: toString
	* Purpose: to represent the state of the object
	* Parameters: none
	* Returns: string
	*/
	@Override
	public String toString()
	{
		String temp = String.format("%s\nAccount Number:%30s\n"
				+ "Number of Withdrawals:%4d\n"
				+ "Number of Deposits:%7d"
				+ "\n%-25s$%.2f"
				+ "\n%-25s%s"
				+ "\nAnnual Intrest Rate%9.1f%%\n\n"
				,super.toString(),accountNumber,numberWithdrawals,numberDeposits,"Balance:",balance,"Account Active:",accountActive,
				(INT_RATE*100));
		return temp;
	}
		
	
	
}
