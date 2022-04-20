package SingleResponsibilityAndOpenClosed;

public class LoanService {

	String loan;
	long loan_amount;
	
	public LoanService(String loan, long loan_amount)
	{
		this.loan = loan; 
		this.loan_amount = loan_amount;
	}
	
	public void loanService()
	{
        	if(loan.equals("personal loan"))
			{
				System.out.println("Personal loan for Rs."+loan_amount+" is allotted ");
			}
			
			if(loan.equals("car loan"))
			{
				System.out.println("Car loan for Rs."+loan_amount+" is allotted ");
			}

	}
	
}
