package oops;

// Student class has a object of Address class

class Address
{
	String location , city , state ;
	
	Address(String location , String city , String state)
	{
		//this.id = id;
		this.location = location;
		this.city = city;
		this.state = state;
	}
	
	String displayAddress()
	{
		return "ADDRESS : "+location+","+city+","+state;
	}
	
}

class Student
{
    String name, id, std ;
    Address address; //Student class HAS - A object of Address class 
    int flag = 0;
    
    Student(String name, String id, String std, Address address)
    {
    	this.name = name;
    	this.id = id;
    	this.std = std;
    	this.address = address;
    	flag = 1;
    }
    
    Student(String name, String id, String std)
    {
    	this.name = name;
    	this.id = id;
    	this.std = std;
    }
    
    void displayDetails()
    {
    	System.out.println(name+"'s Details ::");
    	System.out.println("ID      - "+id);
    	System.out.println("STD     - "+std);
    	if(flag == 1)
    	{
    		System.out.println("ADDRESS - "+address.location+","+address.city+","+address.state);
    	}
    }
    
}

 public class Aggregation
 {
	 
	public static void main(String[] args) {
		
		Address address1 = new Address("VGN flats", "Chennai", "TamilNadu");
		System.out.println(address1.displayAddress());
		System.out.println();
	
		Student student1 = new Student("Sri", "vh1245", "XII");
        student1.displayDetails();
        System.out.println();
           
        Student student2 = new Student("Sri", "vh1245", "XII", address1);
        student2.displayDetails();
	}

}
