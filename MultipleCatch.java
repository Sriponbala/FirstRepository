package ExceptionHandling;

class Division
{
	Division(){
		try
		{
			int quotient = 10 / 0 ;
			
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
			System.out.println("ArithmeticException is caught in Generic Exception catch block \nThe denominator should not be zero");
		}
		System.out.println("In Division class' constructor");
	}

	
}
public class MultipleCatch {

	public static void main(String[] args) {
		
		Division division = new Division();

	}

}
