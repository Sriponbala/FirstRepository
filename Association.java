package oops;

import java.util.Scanner;

class Student
{
	String name, issue_date, renew_date, return_date;

	Student(String name, String issue_date, String renew_date, String return_date)
	{
		this.name = name;
		this.issue_date = issue_date;
		this.renew_date = renew_date;
		this.return_date = return_date;
	}
	
	boolean checkThePresenceOfLibrarian(Librarian librarian)
	{
		System.out.println("In checkPresenceOFLibrarian method of Student class, the Librarian class's object is passed for interaction \n"
				+"and using the librarian object members and methods of Librarian class are called. \n ");
		
		if(librarian.statusOfLibrarian(librarian.status))
		{
			System.out.println("Librarian "+librarian.name+" is Present");
			System.out.println("So, Student "+name+" can return the book, today");
			return true;
		}
		else
		{
			System.out.println("Librarian "+librarian.name+" is Absent");
			System.out.println("So, Student "+name+" can't return the book, today");
			return false;
		}
	}
	
	void studentDetails(String name, String issue_date, String renew_date, String return_date)
	{
		System.out.println("Student name : "+name
				+"\nBook issue date : "+issue_date
				+"\nBook renew date : "+renew_date
				+"\nBook return date : "+return_date);
	}
}

class Librarian
{
	String name , status;
    
	Librarian(String name, String status)
	{
		this.name = name;
		this.status = status;
	}
	
	boolean statusOfLibrarian(String status)
	{
		if(status.equalsIgnoreCase("Present"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	void checkStudentDetails(Student student)
	{
		System.out.println("The Student class's object is passed to checkStudentDetails method of Librarian class \n"
				+ "using which the data members and methods of Student class are called in Librarian class \n");
	
		student.studentDetails(student.name, student.issue_date, student.renew_date, student.return_date);
		
		System.out.println();
		System.out.println("In this way the meaning interaction between Student and Librarian class happens.");
	}
	
}

public class Association {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("The concept of Association is demostrated in this program \nEnter status of librarian : ");
		
        Librarian librarian = new Librarian("Sindhu", scanner.nextLine());
        
        Student student1 = new Student("Sri", "01-04-2022", "15-04-2022", "30-04-2022");

        if(student1.checkThePresenceOfLibrarian(librarian))
        {
        	System.out.println();
        	librarian.checkStudentDetails(student1);
        	System.out.println();
        }
        else
        {
        	System.out.println("\nWhen Student class interacted with Librarian class, it was found that the librarian is absent today");
        }
	}

}

