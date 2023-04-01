package org.Technical;

public class Technical_Task_SI_5 {

	public void payBill() {
		System.out.println("pay bills");

	}

}


class googlePay extends Technical_Task_SI_5 {
	
	public void payBill() {
		System.out.println("pay bills through google pay");

	}

	
}


class paytm extends Technical_Task_SI_5{
	
	public void payBill() {
		System.out.println("pay bills through paytm");

	}
	
}



class overridden{
	
	public static void main(String[] args) {
		
		Technical_Task_SI_5 meth=new Technical_Task_SI_5();
		meth.payBill();
		
		googlePay gpay=new googlePay();
		gpay.payBill();
		
		paytm pay=new paytm();
		pay.payBill();
		
	}
}