package ExceptionHandling;
import java.io.*;
class  Weeks
{
	void weeks()
	{
		System.out.println();
	}
}

class Days extends Weeks
{
	void days()
	{
		System.out.println();
	}
}

class MultipleTry
{
	public void demo()
	{
		System.out.println();
	}
	public void multipleTryDemo()
	{
		try
		{
			try
			{
				try
				{
					try
					{
						try
						{
							try
							{
								try
								{
									int array[] = new int[-5];
								}
								catch(NegativeArraySizeException exception)
								{
									System.out.println(exception);
								}
								Weeks week = new Weeks();
								Days day = (Days) new Weeks();
							}
							catch(ClassCastException exception)
							{
								System.out.println(exception);
							}
							int number = Integer.parseInt("ABC");
						}
						catch(NumberFormatException exception)
						{
							System.out.println(exception);
						}
						String name = "Sri";
						System.out.println(name.charAt(5));				
					}
					catch(StringIndexOutOfBoundsException exception)
					{
						System.out.println(exception);
					}
					String stringField = null ;
					System.out.println(stringField.toLowerCase());
				}
				catch(NullPointerException exception)
				{
					System.out.println(exception);
				}		
				
				int arr[] = {1, 2};
				System.out.println(arr[2]);
			}
			catch(ArrayIndexOutOfBoundsException exception)
			{
				System.out.println(exception);
			}
		int a = 10/0;
		}
		catch(ArithmeticException exception)
		{
			System.out.println(exception);
		}
	
	}
	
}
public class TryCatch
{
	static
	{
		System.out.println("Exceptions in Java\n");
	}
	public void demos()
	{
		System.out.println();
	}
	public static void main(String[] args) 
	{
      MultipleTry multipletry = new MultipleTry();
      multipletry.multipleTryDemo();
	}
}
