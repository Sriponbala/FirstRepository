package ExceptionHandling;
public class ThrowDemo 
{
    static void usingThrow()
    {
    	int array[] = new int[5] , value = 0;
    	try
    	{
    		for(int i = 0 ; i < 6 ; i++)
        	{
        		System.out.println("Value at index "+i+" of array is "+array[i]);
        	}
    		throw new ArrayIndexOutOfBoundsException();
    	}
    	catch(ArrayIndexOutOfBoundsException exception)
    	{
    		System.out.println(exception);
    	}
    	
    	while(value == 0)
    	{
    		throw new ArithmeticException("Denominator value is 0 so Divide by zero exception has occurred and thrown to default handler!"); //this msg is passed to constructor of Exception class and printed
    	}
    	value++;
    }
	public static void main(String[] args)
	{
		usingThrow();
	}

}
