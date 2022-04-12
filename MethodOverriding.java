package oops;

class Interest
{
     private long account_no;
     private float balance;
     public float si;
     String customer_name ;
     
     Interest(String customer_name)
     {
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
	 
	 void interest(float rate , int time)
	 {
		 si = balance * rate * time ;
		 System.out.println("SI : "+si);
	 }
  
}
class HDFC extends Interest
{
	HDFC(String customer_name)
	{
		super(customer_name);
	}
	float rate;
	void interest(float rate , int time)
	{
		this.rate = rate;
		float si = super.getBalance() * rate * time ;
		System.out.println(super.customer_name+" with account number "+super.getAccount_no() +" in HDFC is provided simple interest of Rs."+si);
	}
	
}
class SBI extends Interest
{
	SBI(String customer_name)
	{
		super(customer_name);
	}
	float rate;
	void interest(float rate , int time)
	{
		this.rate = rate;
		float si = super.getBalance() * rate * time ;
		System.out.println(super.customer_name+" with account number "+super.getAccount_no() +" in SBI is provided simple interest of Rs."+si);
	}
	
}
public class MethodOverriding
{
	public static void main(String...strings)
	{
		Interest interest = new Interest("Sri");
		interest.interest(0 , 0);
		
		HDFC obj = new HDFC("Sri");
		obj.setAccount_no(3456888668399l);
		obj.setBalance(10000.0f);
		obj.interest(0.1f, 1);
		
		SBI obj1 = new SBI("Sri");
		obj1.setAccount_no(4456888668399l);
		obj1.setBalance(10000.0f);
		obj1.interest(0.2f, 1);
		
	}
}





























