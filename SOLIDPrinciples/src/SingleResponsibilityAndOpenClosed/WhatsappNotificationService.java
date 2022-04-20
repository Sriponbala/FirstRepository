package SingleResponsibilityAndOpenClosed;

public class WhatsappNotificationService implements NotificationService {

    long loan_amount;
	
    WhatsappNotificationService(long loan_amount)
	{
		this.loan_amount = loan_amount;
	}

	public void sendTransactionReport(String medium) {
		
		System.out.println("Report via"+medium+" : Loan amount of Rs."+loan_amount+" is transferred to your account ");
	}
}
