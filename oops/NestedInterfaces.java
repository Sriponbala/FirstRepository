package oops;

interface One {
	
	void show();
	public default void msgOne() {
		System.out.println("\tDefault method msgOne in Interface One \n");
	}
	
	interface InOne{
		void msg();
		public default void inOne_msg() {
			System.out.println("\tDefault method inOne_msg in Interface InOne \n");
		}
		
		interface InInOne{  
			void thirdInterface();
			public default void demo() {
				System.out.println("InInOne default method named demo \n");
			}	
		}		
	}
	
}

class ClassOne implements One {
	
	 ClassOne()
	 {
		 System.out.print("The default method of interface One can only be called when you implement interface One, it is called using super keyword or \neven with the object of the class which implements One : \n\t");
		 One.super.msgOne(); //accessing default  method of the interface One bcoz it is only implemented in ClassOne
	 }
     public void show() {
    	 System.out.println("ClassOne implements Interface One and the implementation of show() is in ClassOne \n");
    	 
     }

}


class ClassTwo implements One.InOne {
	 ClassTwo(){
		 System.out.print("The default method of interface InOne can only be called when you implement InOne directly like One.InOne : \n\t");
		 One.InOne.super.inOne_msg();
     }
	 public void msg() {
    	 System.out.println("Implementation of inOne_msg method of interface InOne in class ClassTwo \n");
     }  
}

class Class3 implements One.InOne.InInOne{
	Class3()
	{
		System.out.print("The default method of interface InInOne can only be called when you implement InInOne directly like One.InOne.InInOne : \n\t");
		 One.InOne.InInOne.super.demo();
	}
	public void thirdInterface() {
		
		
	} 
}  
class Class4 {
	
	interface InClass4 {
		void show1();
	}
	
}
public class NestedInterfaces implements Class4.InClass4 /*Class4.Inclass4 - accessing interface nested in class4 */{

	public void show1() {
		System.out.println("Implementation of interface InClass4 is in NestedInterfaces class. ");
	}
	
	public static void main(String[] args) {
		 
		ClassOne c = new ClassOne();
		c.show();
		//c.msg();
		ClassTwo t = new ClassTwo();
		t.msg();
        Class3 cls = new Class3();
        cls.thirdInterface();
        NestedInterfaces nested = new NestedInterfaces();
        nested.show1();
    
	}

}
