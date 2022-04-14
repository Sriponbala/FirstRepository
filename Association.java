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
		student.studentDetails(student.name, student.issue_date, student.renew_date, student.return_date);
	}
	
}

public class Association {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter status of librarian : ");
		
        Librarian librarian = new Librarian("Sindhu", scanner.nextLine());
        
        Student student1 = new Student("Sri", "01-04-2022", "15-04-2022", "30-04-2022");

        if(student1.checkThePresenceOfLibrarian(librarian))
        {
        	System.out.println();
        	librarian.checkStudentDetails(student1);
        	System.out.println();
        }
        
	}

}

