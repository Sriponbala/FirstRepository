package ExceptionHandling;

class Rethrow {
	
	void rethrowingException() {
		
		try {
			
			String word = "Word";
			word.charAt(10);
			throw new StringIndexOutOfBoundsException();
			
		}
		catch(StringIndexOutOfBoundsException exception) {
			
			System.out.println(exception);
			throw exception;
		}	
	}
}

public class RethrowingException {

	public static void main(String[] args) {
		
		Rethrow rethrow = new Rethrow();
		try {
			
			rethrow.rethrowingException();

		}
		catch(StringIndexOutOfBoundsException exception) {
			
			System.out.println("Exception caught in main() : "+exception.getMessage());
		
		}
	}

}
