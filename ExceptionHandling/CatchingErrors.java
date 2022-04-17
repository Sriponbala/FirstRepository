package ExceptionHandling;

public class CatchingErrors {

	public static void catchingStackOverflowError()
	{
		try
		{
			catchingStackOverflowError();
		}
		catch(StackOverflowError error)
		{
			System.out.println("StackOverflowError has occurred!");
		}
		catch(Error error)
		{
			System.out.println("Error has occurred!  "+error);
		}
	}

    public static void catchingOutOfMemeoryError()
    {
	    try
	    {
		    int[] arr= new int[1000000000*100000];
	    }
	    catch(OutOfMemoryError error)
	    {
		    System.out.println("OutOfMemeoryError has occurred!");
	    }
	    catch(Error error)
	    {
		    System.out.println("Error : "+error);
	    }
	    
    }

	public static void main(String[] args) {
		
          catchingStackOverflowError();
          catchingOutOfMemeoryError();
	}

}
