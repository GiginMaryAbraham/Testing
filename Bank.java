//Write a program to deposit and withdraw amount from bank account(Withdrawal amount do not exceeds the current balance). Add an extra method to check the account balance. (static methods)
class Bank
{	static int amount=50000,withdraw=2000;
	public static void deposit()
	{
	System.out.println("Amount deposited is " +amount);
	System.out.println("Amount withdrawed is " +withdraw);
	}
	public static void balance()
	{
	 int balance=amount-withdraw;
	System.out.println("Account balance is " +balance);
	} 
public static void main(String arg[])
{
Bank.deposit();
Bank.balance();
}
}