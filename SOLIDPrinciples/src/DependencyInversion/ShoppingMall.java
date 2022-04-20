package DependencyInversion;

public class ShoppingMall {

	private BankCard bankcard;// ShoppingMall coupled with BankCard
	
	public ShoppingMall(BankCard bankcard)
	{
		this.bankcard = bankcard;
	}
	
	public void doPurchase(long amount)
	{
		bankcard.doTransaction(amount);
	}
	
	public static void main(String...args)
	{
		BankCard bankcard = new DebitCard();
//	    BankCard bankcard = new CreditCard();
		
		ShoppingMall shoppingmall = new ShoppingMall(bankcard);
		
		shoppingmall.doPurchase(5000);
		
	}
}
