package oops;

import java.util.Scanner;

class privateDemo {
	
 //public fields with getters and setters	
	public int num ;
	public int getNum()
	{
		return num;
	}
	public void setNum(int num) 
	{
		if(num < 10) 
		{
		this.num = num;
		}
	}
	
 //private fields with getters and setters 	
    private int num1 ;  
	public int getNum1() 
	{
		return num1;
	}
	public void setNum1(int num1) 
	{
		if(num1 < 10) //this is the main use of setters we can do validation and set the value of private field then
		{
		this.num1 = num1;
		}
	}
	
 // Validation 
	private float amount ;
	public float getamount() {
		return amount;
	}
	public void setPassword(String password , float amount) {
		if(password.equals("@Sriponbala01"))
		{
		System.out.println("Authentication done");
		this.amount = amount;
		}
		else
		{
			System.out.println("Authentication failed");
		}
	}
	
		
}
public class GettersAndSetters {

	public static void main(String[] args) {
		
		privateDemo d = new privateDemo();
		
		Scanner sc = new Scanner(System.in);
	//This is how you do validation using private fields and getters and setters
		System.out.println("Enter the password :");
		String password = sc.nextLine();
		d.setPassword(password , 50_000);
		System.out.println("Your bank balance is "+d.getamount());
		
		
        
      //setting value for public field num
        d.setNum(10);
        System.out.println(d.getNum());
        
      //setting value for private field num1
        d.setNum1(5);
        System.out.println(d.getNum1());
        
      //can directly change values of public fields which may lead to misuse
        d.num = 25;
        System.out.println(d.num);
       // System.out.println(d.num1); // Cannot directly access or change the values of private fields so provides encapsulation 
        
        
	}

}
