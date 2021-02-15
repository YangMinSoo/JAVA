package chpater7;

//ÀºÇà °èÁÂ
public class BankAccount {
	int balance=0;
	String accNum;
	String accName;
	
	public BankAccount(String name, String num, int bal)
	{
		balance= bal;
		accNum= num;
		accName= name;
		
	}
	
	public int deposite(int amount)
	{
		balance+=amount;
		return balance;
	}
	
	public int withdraw (int amount)
	{
		balance-=amount;
		return balance;
	}
	
	public int checkbalance()
	{
		System.out.println("balance is "+ balance);
		return balance;
	}
	
	public void checkAccount()
	{
		System.out.println("Name is "+ accName);
		System.out.println("account number is "+ accNum);
		System.out.println("balance is "+ balance);
	}
}
