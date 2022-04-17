package oops;

class ClassTemplate 
{
	String class_name , staff_name[] , subject_name[] ;
	int students , subjects ;
	ClassTemplate(String class_name , int students , int subjects , String staff_name[] , String subject_name[]) 
	{
		this.class_name = class_name;
		this.students = students ;
		this.subjects = subjects ;
		this.staff_name = staff_name;
		this.subject_name = subject_name;		
	}
	public void classDetails()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Class "+class_name);
		System.out.println("Number of students in " + class_name + " are " + students);
		System.out.println("Number of subjects for " + class_name + " are " + subjects);
		for(int i = 0 ; i < subject_name.length ; i++)
		{
			System.out.println(subject_name[i] +" is handled by " + staff_name[i]);
		}
	}
}
public class ClassAndObjects {

	public static void main(String[] args) {
		
		ClassTemplate object1 = new ClassTemplate("10 \'A\'", 45, 2, new String[] {"Sudha", "Monisha"}, new String[]  {"Maths" ,"Biology"});
		ClassTemplate object2 = new ClassTemplate("10 \'B\'", 42, 2, new String[] {"Malar", "Kavya"}, new String[]  {"Maths" ,"Biology"});
		ClassTemplate object3 = new ClassTemplate("12 \'A\'", 50, 4, new String[] {"Sudha", "Monisha", "Sudha", "Ram"}, new String[]  {"Maths" ,"Biology", "Physics", "Chemistry"});
		object1.classDetails();
		object2.classDetails();
		object3.classDetails();
		System.out.println("-------------------------------------------------------------------------------------");
		
	}

}
