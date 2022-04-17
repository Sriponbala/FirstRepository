package oops;

interface Electric 
{
	void charge();
}

abstract class Vehicle
{
	abstract void start();
	abstract void move();
	abstract void stop();
}

class Car extends Vehicle
{
	{
		System.out.println("The car is black in colour");
	}
	void start()
	{
		System.out.println("The car started.");
	}
	void move()
	{
		System.out.println("It is moving.");
	}
	void stop()
	{
		System.out.println("The car stopped.");
	}
}

class Bike extends Vehicle implements Electric
{

	{
		System.out.println("The Bike is Grey in colour");
	}
	void start()
	{
		System.out.println("The bike started.");
	}
	void move()
	{
		System.out.println("It is moving.");
	}
	void stop()
	{
		System.out.println("The bike stopped.");
	}
	public void charge()
	{
		System.out.println("Charge the bike");
	}
	
}

class Auto extends Vehicle 
{
	{
		System.out.println("Auto");
	}
    void start() 
    {
    	System.out.println("The Auto started.");
	}

	void move() 
	{
		System.out.println("It is moving.");
	}

	void stop() 
	{
		System.out.println("The Auto stopped.");
	}
}


public class InterfaceAndAbstractClass 
{

	public static void main(String[] args)
	{
		Vehicle vehicle;
		vehicle = new Car();
		vehicle.start();
		vehicle.move();
		vehicle.stop();
		System.out.println();
		
		vehicle = new Bike();
		vehicle.start();
		vehicle.move();
		vehicle.stop();
		
		Electric electric = new Bike();
		electric.charge();
		System.out.println();
		
		Auto auto;
		auto = new Auto();
		auto.start();
		auto.move();
		auto.stop();
		System.out.println();
	
	}

}
