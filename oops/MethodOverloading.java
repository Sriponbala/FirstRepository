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





/*public class MethodOverloading {
public static void main(String[] args) {
	overload1();
	overload1("Sri");
	System.out.println(overload1(10)); // static int overload1(int n) is called and not the second one static String overload1(int n) 
	System.out.println(overload1(10.0));
	System.out.println(overload1(10)); // static int overload1(int n) is called and not the second one static String overload1(int n) 
	System.out.println(overload1(10 , 10.00000f));
}
static void overload1() {
	System.out.println("overload1");
}
static void overload1(String name) {
	System.out.println("overload1 "+name);
}
static int overload1(int n) { 
    return  20;
}
static String overload1(int n) {
	String str = String.valueOf(n);
    return str;
} 
static int overload1(int n , float m) { 
    return  30;
}
static boolean overload1(double n) {
   boolean val = n > 3 ? true : false ;
   return val;
}  
}*/
