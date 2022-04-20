package DependencyInversion;

public class DebitCard implements BankCard {

	public void doTransaction(long amount) {
		
		System.out.println("Paid Rs."+amount+" using DebitCard!");
	}

}
