package oops;

import java.util.Scanner;

abstract class Calculator
{

	static String name = "                   Calculator                 \n";
	
    Calculator()
    {
        System.out.println(name);
    }

    static void description()
    {
    	System.out.println("This calculator is built to work with only two operands\n");
    }
    
    public void operations()
    {
    	System.out.println("The operations provided by the calculator are :\n"
        		+ "\t 1.Addition\n"
        		+ "\t 2.Subtraction\n"
        		+ "\t 3.Multiplication\n"
        		+ "\t 4.Division\n");	
    }
    
	abstract int add(int x, int y);
	abstract int subtract( int x, int y);
	abstract int multiply( int x, int y);
	abstract int divide( int x, int y);
	
}

class Implementation extends Calculator
{
	
	int add(int x, int y)
	{
		return x + y;
	}
	
	int subtract(int x, int y) 
	{	
		return x - y;
	}
	
	int multiply(int x, int y)
	{
		return x * y;	
	}
	
	int divide(int x, int y) 
	{
		return x / y;
	}
}

public class Abstraction {

	public static void main(String[] args) {
		
       Scanner scanner = new Scanner(System.in);
       
       Implementation implementation = new Implementation(); //constructor call of  abstract class
       
       implementation.operations();
       
       Calculator.description(); // static method of abstract class
       
       System.out.println("Enter two integers : ");
       int x = scanner.nextInt();
       int y = scanner.nextInt();
       
       System.out.println("Addition : "+ implementation.add(x, y)); //abstract methods call
       System.out.println("Subtraction : "+implementation.subtract(x, y));
       System.out.println("Multiplication : "+implementation.multiply(x, y));
       System.out.println("Division : "+implementation.divide(x, y));
        
	}

}
