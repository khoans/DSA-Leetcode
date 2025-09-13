package com.nskhoa;

/*
*  An adapter helps two incompatible interfaces to work together. This is the real world definition
 * for an adapter. Interfaces may be incompatible but the inner functionality should suit the need.
 * The Adapter design pattern allows otherwise incompatible classes to work together by converting
 * the interface of one class into an interface expected by the clients.
* */
public class Main {
    public static void main(String[] args) {
        // Using old system
        PaymentProcessor credit = new CreditCardProcessor();
        credit.pay(100.0); // Output: Processing credit card payment of $100.0


        // Using new system via adapter
        NewPayAPI newPay = new NewPayAPI();
        PaymentProcessor adapter = new NewPayAdapter(newPay);
        adapter.pay(150.0); // Output: NewPay: Processing payment of 15000 cents

    }
}
