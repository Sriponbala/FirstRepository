package DependencyInversion;

public class CreditCard implements BankCard {

	public void doTransaction(long amount) {
		
		System.out.println("Paid Rs."+amount+" using CreditCard!");
	}

}
