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
	 
	 
	 void newMethod()
	 {
		 System.out.println("New method of Account class");
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
		
		
		Account account = new CurrentAccount("SBI", "Bala"); // UPCASTING (IMPLICIT)
		account.getAccount_no();
		account.getBalance();
		account.setAccount_no(0l);
		account.setBalance(0f);
//		account.transaction(0f);  cant access child class' CurrentAccount's members only Account's members are accessible
		
		
// DOWNCASTING IS ONLY POSSIBLE WHEN THE PARENT REFERENCE OBJECT IS OF CHILD TYPE AND THEN THE PARENT OBJECT IS TYPECASTED TO THE SAME CHILD OBJECT		
		if(account instanceof CurrentAccount) {
			System.out.println();
			System.out.println("YES");
		}
		
		CurrentAccount c1 = (CurrentAccount)account;//(new Account("DFG", "Sriponbala"));//account1; // DOWNCASTING (EXPLICIT)
		c1.setAccount_no(43336788990008l);
		c1.setBalance(10_000.0f);
	//	c1.interest(0.1f, 1);    cant access SavingAccount class' members
		c1.transaction(10_000.0f);
		
	}
	
}


/*class example1 {
void ex1() {
	System.out.println("EXAMPLE 1");
}
}
class example2 extends example1 {
void ex2() {
	System.out.println("EXAMPLE 2");
}
}
public class HierarchialInheritance extends example1 {
void ex3() {
	System.out.println("EXAMPLE 3");
}
public static void main(String[] args) {
	 HierarchialInheritance obj =  new HierarchialInheritance();
	 obj.ex1();
	 obj.ex3();
	 example2 obj1 = new example2();
	 obj1.ex1();
	 obj1.ex2();
}
}*/






























