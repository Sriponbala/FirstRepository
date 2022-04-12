package oops;

class Account
{
     private long account_no;
     private float balance;
     String bank_name , customer_name ;
     
     Account(String bank_name , String customer_name)
     {
    	 this.bank_name = bank_name;
    	 this.customer_name = customer_name ;
     }
     
	 public long getAccount_no() {
		return account_no;
	 }
	 public void setAccount_no(long account_no) {
		this.account_no = account_no;
	 }
	 public float getBalance() {
		return balance;
	 }
	 public void setBalance(float balance) {
		this.balance = balance;
	 }
  
}
class SavingsAccount extends Account
{
	SavingsAccount(String bank_name, String customer_name) {
		super(bank_name, customer_name);
	}
	
	float si ;
	void interest(float rate , int time)
	{
		si = super.getBalance() * rate * time ;
		System.out.print(super.customer_name+" with account number "+super.getAccount_no() +" is provided simple interest of Rs."+si);
	}
	
}
class CurrentAccount extends Account
{
	CurrentAccount(String bank_name, String customer_name) {
		super(bank_name, customer_name);
	}
	
	float balance;
	void transaction(float amount)
	{
		 balance = Math.abs(super.getBalance() - amount);
		 System.out.println("Remaining balance : "+balance);
	}
}
public class HierarchialInheritance 
{
	public static void main(String... args)
	{
		CurrentAccount c = new CurrentAccount("HDFC" , "Sri");
		c.setAccount_no(53336788990008l);
		c.setBalance(50_000.0f);
		c.transaction(10_000.0f);
		
		SavingsAccount s = new SavingsAccount("HDFC" , "Sri");
		s.setAccount_no(43336788990008l);
		s.setBalance(10_000.0f);
		s.interest(0.1f, 1);
	}
	
}
































