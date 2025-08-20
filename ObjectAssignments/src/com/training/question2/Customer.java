package com.training.question2;

public class Customer {

	public static void main(String[] args) {
    PaymentOptions payment=new PaymentOptions();
    payment.pay(3000);
    payment.pay(8999,99,3000);
    payment.pay("8999@ybl.com",3000);
    payment.pay("SBY","Ram ",3000);
	}

}
