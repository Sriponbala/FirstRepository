package oops;

class Parent {
	
	int property_worth ;
	Parent(int x)
	{
	 property_worth = x;
	}
	
	void property() 
	{
		System.out.println("Property worth of Parent : "+property_worth);
	}
}

public class SingleInheritance extends Parent{
	
	int child_prop_worth ;
    SingleInheritance(int x)
    {
    	super(5_00_000);
    	child_prop_worth = x;
    }
    
	public static void main(String[] args) 
	{		
		SingleInheritance object = new SingleInheritance(10_00_000);	
		object.property();
		object.propertyWorthOfChild();
	}
	
	void propertyWorthOfChild()
	{
		System.out.println("Property worth of child : " + child_prop_worth);
		System.out.println("Now the toatl property worth of child : " +(property_worth + child_prop_worth));
	}

}
