package InterfaceSeggregation;

public class PhonePay  implements UPIPayments {

	public void payMoney() {
		
		System.out.println("Pay Money through payMoney ");
	}

	public void getScratchCard() {
	
		System.out.println("get scratchcard in payMoney ");
	}

}