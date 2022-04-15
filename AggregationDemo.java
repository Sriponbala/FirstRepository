package oops;


class StudentData
{
	String name, rollno, issue_date, renew_date, return_date;
	StudentData student;
	
	StudentData(String name, String rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	
	StudentData(StudentData student, String issue_date, String renew_date, String return_date)
	{
		this.student = student;
		this.issue_date = issue_date;
		this.renew_date = renew_date;
		this.return_date = return_date;
	}
	
	void studentInfo()
	{
		System.out.println("Student name is "+name);
		System.out.println("Student roll no is "+rollno);
//		System.out.println(this.student.issue_date); Exception : this.student is null
	}
	
	void studentLibraryDatabase() 
	{
		System.out.println("Student's name : "+student.name);
		System.out.println("Book Issue date - "+issue_date);
		System.out.println("Book Renew date - "+renew_date);
		System.out.println("Book Return date - "+return_date);
	}
	
}

class Library //Library contains the Student object
{
	int no_of_books, no_of_staff ;
	Library(int no_of_books, int no_of_staff)
	{
		this.no_of_books = no_of_books;
		this.no_of_staff = no_of_staff;
	}
	
	void libraryDetails()
	{
		System.out.println("The Library consists of "+no_of_books+" books and "+no_of_staff+" staff");
	}
	
	void studentDetails(StudentData student)
	{
		student.studentLibraryDatabase();
	}
}
public class AggregationDemo {

	public static void main(String[] args) {
		 
		System.out.println("The StudentData class is independent \nIt does not hold the object of Library class \n");
		StudentData student1 = new StudentData ("Bala", "VH1234");
		StudentData  student2 = new StudentData ("Naveen", "VH1235");
		
		student1.studentInfo();
		System.out.println();
		student2.studentInfo();
		System.out.println();
		
		System.out.println("The Library class is also independent \n");
		Library library = new Library(5000 , 10);
		library.libraryDetails();
		System.out.println();
		
		System.out.println("But the Library class holds the reference of StudentData class to get the student details \n"
				+ "In this way the aggregation is uni-directional \n");
		StudentData  student1_libraryDB = new StudentData (student1, "01-04-2022", "07-04-2022", "15-04-2022");
		StudentData  student2_libraryDB = new StudentData (student2, "05-04-2022", "12-04-2022", "20-04-2022");
		
		
		library.studentDetails(student1_libraryDB);
		System.out.println();
		library.studentDetails(student2_libraryDB);
		System.out.println();		

	}

}
