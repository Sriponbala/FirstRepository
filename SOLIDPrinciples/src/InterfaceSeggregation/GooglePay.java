package InterfaceSeggregation;

public class GooglePay implements CashBackManager, UPIPayments {

	public void payMoney() {
		
		System.out.println("payMoney through Googlepay");
	}

	public void getScratchCard() {
			
		System.out.println("get scratchcard in Googlepay");
	}

	public void getCashBackAsCreditBalance() {
			
		System.out.println("get cash back as credit balanace in Googlepay");
	}

}
