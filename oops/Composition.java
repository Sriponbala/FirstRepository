package oops;


class CollegeStudent
{
	String student_name, roll_no ;
	int batch;
	double cgpa;
	
	CollegeStudent(String student_name, String roll_no, int batch, double cgpa)
	{
		this.student_name = student_name;
		this.roll_no = roll_no;
		this.batch = batch;
		this.cgpa = cgpa;
	}
	
	void details()
	{
		System.out.println("Student name : "+student_name);
		System.out.println("Roll number : "+roll_no);
		System.out.println("Batch : "+batch);
		System.out.println("CGPA : "+cgpa);
	}
	
	
}

class EngineeringCollege
{
	String college_name, location; 
	int no_of_depts;
	
	EngineeringCollege(String college_name, String location, int no_of_depts)
	{
		this.college_name = college_name;
		this.location = location;
		this.no_of_depts = no_of_depts;
	}
	
	void collegeDetails()
	{
		System.out.println("College name : "+college_name);
		System.out.println("College location : "+location);
		System.out.println("Total number of Departments : "+no_of_depts);
	}
	
	void studentDetails()
	{
		CollegeStudent student1 = new CollegeStudent("Sri", "VH10027", 2023, 95.7);
		CollegeStudent student2 = new CollegeStudent("Bala", "VH10028", 2023, 75.7);
		student1.details();
		System.out.println();
		student2.details();
	}
	
	
}

public class Composition {

	public static void main(String[] args) {
		
		EngineeringCollege college = new EngineeringCollege("ABC Engineering College", "Avadi", 10);
		college.collegeDetails();
		System.out.println();
		college.studentDetails();
		
	}

}
