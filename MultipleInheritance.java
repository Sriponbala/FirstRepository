package oops;

import java.util.Scanner;

interface Father
{
	String father_name = "Subash";
	int birth_year_of_father = 1973;
	
	public static int currentAge(int year)
	{
		return (year - birth_year_of_father)-1;
	}
	
	public default void fatherDetails(String child_name)
	{
		System.out.println(child_name +"'s father's name is "+father_name);
		System.out.println("He is a Mathematician");
	}
	
	void singing();
	void playingCricket();
	
}

interface Mother
{
	String mother_name = "Uma";
	int birth_year_of_mother = 1975;
	
	public static int currentAge(int year)
	{
		return (year - birth_year_of_mother)-1;
	}
	public default void motherDetails(String child_name)
	{
		System.out.println(child_name +"'s mother's name is "+mother_name);
		System.out.println("She is a Software Engineer");
	}
	
	void singing();
	void playingChess();
	
}

class Child implements Father , Mother
{
	String child_name;
	int year;
	
	Child(String child_name, int year)
	{
		this.child_name = child_name;
		this.year = year;
		Father.super.fatherDetails(this.child_name);
		System.out.printf("Current age of father is %s\n\n",Father.currentAge(this.year));
		Mother.super.motherDetails(this.child_name);
		System.out.printf("Current age of mother is %s\n\n",Mother.currentAge(this.year));
	
	}
	
	public void singing()
	{
		System.out.println(child_name +" inherits the art of singing from both of his parents ");
		System.out.println();
	}
	
	public void playingCricket()
	{
		System.out.printf("%s's father, %s is a Cricket Player \n\n",child_name, Father.father_name);
	}
	
	public void playingChess()
	{
		System.out.printf("%s's mother, %s is a Chess Player \n\n",child_name, Mother.mother_name);
	}
	
	public void playsFootball()
	{
		System.out.printf("%s is a Football Player \n\n",child_name);
	}
}

public class MultipleInheritance
{
	public static void main(String[] args)
	{
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Child's name :");
        String child_name = scanner.nextLine();
        
        System.out.println("Enter present year : ");
        int year = scanner.nextInt();
        scanner.nextLine();
        
        Child child = new Child(child_name , year);
    
        child.singing();
        child.playingCricket();
        child.playingChess();
        child.playsFootball();
        
	}
} 
