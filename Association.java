package oops;

class Students
{
	String name, issue_date, renew_date, return_date;
	

	Students(String name, String issue_date, String renew_date, String return_date)
	{
		this.name = name;
		this.issue_date = issue_date;
		this.renew_date = renew_date;
		this.return_date = return_date;
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
	String name;

	void checkStudentDetails(Students students)
	{
		students.studentDetails(students.name, students.issue_date, students.renew_date, students.return_date);
	}
	
}

public class Association {

	public static void main(String[] args) {
		
		Students student1 = new Students("Sri", "01-04-2022", "15-04-2022", "30-04-2022");
	//	student1.studentDetails("Sri", "01-04-2022", "15-04-2022", "30-04-2022"); System.out.println();
				
		Students student2 = new Students("Bala", "01-04-2022", "15-04-2022", "30-04-2022");
	//	student1.studentDetails("Bala", "01-04-2022", "15-04-2022", "30-04-2022"); System.out.println();
		
        Librarian librarian = new Librarian();
        librarian.checkStudentDetails(student1);
        System.out.println();
        
        librarian.checkStudentDetails(student2);
    //   librarian.name = "Sri";
	}

}

