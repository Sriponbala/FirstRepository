package oops;

interface ExampleDemo
{
	static void msg() {
		System.out.println("Static method in interface");
	}
	public default void show()
	{
		System.out.println("Interface Defauly");
	}
}

class DemoExam implements ExampleDemo
{	
    DemoExam()
    {
    	ExampleDemo.super.show();
    	ExampleDemo.msg();
    }	
}

public class Demo {
	public static void main(String args[])
	{
		DemoExam d = new DemoExam();	
	}
}
