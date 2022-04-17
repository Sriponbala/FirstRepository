package ExceptionHandling;

import java.util.Scanner;

class Finally
{
	Scanner sc = new Scanner(System.in);
	
	public void tryCatchFinally()
	{
		try
		{
			int quotient = 10 / 0;
			
		}
		catch(Exception exception)
		{
			System.out.println("Divide by zero Exception");
			System.out.println("Enter a number : ");
			int number = sc.nextInt();
		}
		finally
		{
			sc.close();
		}
		
		try
		{
			String name = sc.nextLine();
		}
		catch(IllegalStateException exception)
		{
			System.out.println("Scanner object is already closed in Finally block so IllegalStateException occurs");
		}
	}
	
	public int returnAndFinally()
	{
		try
		{
			for(int i = 0 ; i < 2 ; i++)
			{
				try 
				{
					System.out.println("i value is "+i);
					if(i == 1)
					{
						break;
					}
					System.out.println(); //executed only when i = 0
				}
				finally // executed even after break statement
				{
					System.out.println("The finally block of for - loop is executed even after the 'break' statemnet");
				}
			}
			return 10; // value returned only after the execution of the Finally block
		}
		finally //executed even after return statement
		{
			System.out.println("\nThe finally block is executed even after return statement");
		}
	}

	public void finallyAndSystemexit()
	{
		try
		{
			System.out.println("System.exit(0) and Finally block");
			System.exit(0);
		}
		finally
		{
			System.out.println("\nThe Finally block is not executed after System.exit(0)");
		}
	}
	
}
public class FinallyBlock 
{
	public static void main(String[] args) {
		
        Finally finally_object = new Finally();
        
        finally_object.tryCatchFinally();
        System.out.println();
        
        int value = finally_object.returnAndFinally();
        System.out.println("\nValue returned from returnAndFinally method is "+value);
        System.out.println();

        finally_object.finallyAndSystemexit(); 
        
        System.out.println("Statement after System.exit(0)"); // Not executed bcoz System.exit(0);
	}
}
