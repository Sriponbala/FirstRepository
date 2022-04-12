package oops;

class Client 
{
	//Method overloading for better readability and maintainability
	void aadharCard(String name, long number)
	{
		System.out.println("Aadhar Card \n"
				+"  "+ name +"\n"
				+"  "+ number);
	}
	
	void aadharCard(String name, long number, String email)
	{
		System.out.println("Aadhar Card \n"
				+"  "+ name +"\n"
				+"  "+ number +"\n"
				+"  "+ email);
	}
}

public class MethodOverloading
{
	public static void main(String... args)
	{
	Client object = new Client();
	object.aadharCard("Sri", 34567899790l);
	System.out.println();
	object.aadharCard("Sri", 34567899790l, "sri@gmail.com");
	}
}




































