package ExceptionHandling;

public class ThrowsDemo {

	public static void usingThrows() {// throws ArithmeticException, NullPointerException {
		
		int quotient = 10 / 2;
	    String name = null;
		name.charAt(0);
		
	}
	public static void main(String[] args) {
	
          try {
        	  
        	  usingThrows();
          }
          catch(Exception exception) {
        	  
        	  System.out.println("Exception thrown from usingThrows() :\n"+ exception);
          }
	}

}
