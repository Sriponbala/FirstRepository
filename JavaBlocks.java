package oops;

public class JavaBlocks {
	
	int example ;
	static String static_var = "Hello";
	
	{
		System.out.println("Instance block to initialize value of example");
		example = 123;
	}
	
	void display(){
		System.out.println("Display method "+example);
	}
	
	{ //outer instance block
		int x = 10;
		System.out.println(x + " outer block");
		{ //inner instance block
			//outer blocks variables can be used in inner block but the vice versa is not possible
			System.out.println(x +" inner block"); 
			int y = 9;
			System.out.println(y +" inner block");
		}
		//System.out.println(y); This is not allowed
	}
	
	JavaBlocks(){
		int constructor = 100;
		System.out.println("default constructor " +constructor);
	}
	
	{
		System.out.println("Second outer instance block");
		System.out.println("value of non static variable example "+example);
		System.out.println("Value of static variable "+static_var);
	}
	
	JavaBlocks(int x){
		int constructor = x;
		System.out.println("single parameter constructor " +constructor);
	}
	
	static { //static block is executed first even without object creation
		//static block is executed only once irrespective of the number of objects created
		int y = 15;
		System.out.println(y);
		{
			System.out.println("Inner static method "+y);
		}
	}
	
	static {
	   //example = 350; // example is a non static var so can't access inside static block 
		System.out.println("second static block "); //+example);
		System.out.println(static_var +" static variable");//static_var is  static variable so accessed here
		float x = 10.0f;
		System.out.println("local variable of static block "+x);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("main() before object creation");
        JavaBlocks obj = new JavaBlocks();
        method();
        obj.display();
        JavaBlocks obj1 = new JavaBlocks(200);
        obj1.display();
        System.out.println("main() after object creation");
        method();
        obj.instanceMethod();
       
	}
	
	static void method() {
		
		{
			System.out.println("Instance block in method()");
		}
		System.out.println("Second static method");
	}
	
	void instanceMethod() {
		{
			System.out.println("Instance block in instanceMethod()");
		}
		System.out.println("Instance method");
	}

}
/*Points to remember :
 
    *static block instantiated only once
    *outer instance block executes first // instance blocks execute everytime the obj is created
    *then the inner instance block executes
    *constructor executes after the instance blocks
    *Constructor logic is specific to an object but instance block object is common to all objects
    *top to bottom - order of execution of instance block
    *memory allocation for instance block - during obj creation
    *can initialize value of variable in instance block
    *static block -  executes first before static method(main()) bcoz it is stored in memory during loading .class file
    *then the static method main() will be executed.
    *only once the dot class file is loaded into the memory
    *multiple static blocks are executed in the same order they are written
    *static main() is a must in java without this even the static blocks cant be executed.
    *cannot access non static variable inside static block
    *static block cant access the instance methods also.
    *instance block can accesss both static & non static variables
    *'this' keyword - not used in static block but used in instance block
    *static block cant be declared inside any method
    *instance block can be declared in any of the methods 
 */