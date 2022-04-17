package ExceptionHandling;

// Custom exception

import java.util.Scanner;

class DuplicateEmailException extends Exception
{
	DuplicateEmailException(String message)
	{
		super(message);
	}
}

public class Email
{
	public static void main(String[] args) //throws DuplicateEmailException // since this is main() with or without throws has same effect
	{	
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid email : ");
        String email = scan.nextLine();
        
        String email_id[] = {"sriponbalak@gmail.com", "abc@gmail.com"};
       
        boolean flag = false ;
        try
        {
        	for(int i = 0 ; i < email_id.length ; i++)
            {
            	if(email.equals(email_id[i]))
            	{
            		flag = true;
            		throw new DuplicateEmailException("\n"+"Email id already exists \nRefresh and try again!");
            	}
            }
            if(flag == false) 
            {
            	System.out.println("Email created!");
            }
        }
        catch(DuplicateEmailException exception)
        {
        	System.out.println("DuplicateEmailException : "+exception);
        }
        
	}

}
