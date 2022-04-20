package SingleResponsibilityAndOpenClosed;

import java.util.*;

public class BankService {

	static Scanner scan = new Scanner(System.in); //why static? Bcoz, if not static need to create obj for this cls and access the members
	static String loan , medium ;
	static long loan_amount;
	static int otp, otp_you_enter;
	
	public static void  main(String args[])
	{
		
		System.out.println("Enter the type of loan : \"personal loan\" or \"car loan\" ?");
		loan = scan.nextLine();
		
		System.out.println("Enter loan amount : ");
		loan_amount = scan.nextLong();
		
		LoanService loanservice = new LoanService(loan,loan_amount);
		loanservice.loanService();
		
		System.out.println("Enter notification medium to receive report : email or whatsapp or mobile ?");
		medium = scan.next();
		
        EmailNotificationService email;
        MobileNotificationService mobile;
        WhatsappNotificationService whatsapp;
        
        switch(medium)
        {
        case "email" :  email = new EmailNotificationService(loan_amount);  email.sendTransactionReport(medium);break;
        case "mobile" :  mobile = new MobileNotificationService(loan_amount); mobile.sendTransactionReport(medium);break;
        case "whatsapp" :  whatsapp = new WhatsappNotificationService(loan_amount); whatsapp.sendTransactionReport(medium);break;
        default :	System.out.println("Wrong medium");break;
        }

		
	}
	
	
}
