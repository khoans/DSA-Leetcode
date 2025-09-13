package com.nskhoa;

public class NewPayAdapter implements PaymentProcessor{
    private NewPayAPI newPayAPI;

    public NewPayAdapter(NewPayAPI newPayAPI) {
        this.newPayAPI = newPayAPI;
    }

    @Override
    public void pay(double amount) {
        int cents = (int) (amount * 100);
        newPayAPI.makePayment(cents);
    }
}
