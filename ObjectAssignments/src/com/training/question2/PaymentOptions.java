package com.training.question2;

public class PaymentOptions {
void pay(double amount)
{
	System.out.println("Cash On Delivery "+amount);
}
void pay(long cardnumber,int cvv,double amount) {
	System.out.println("pay using card:" +amount);
}
void pay(String upiid,double amount) {
	System.out.println("pay using gpay:" +amount);
}
void pay(String bankname,String username,double amount) {
	System.out.println("pay using netbanking:" +username+amount);
}
}
