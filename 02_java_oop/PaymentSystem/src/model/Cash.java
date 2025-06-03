package model;

public class Cash extends PaymentMethod {

    public Cash(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Nakit olarak " + getAmount() + " TL ödeme yapıldı.");
        setSuccess(true);
    }

    @Override
    public String toString() {
        return "Nakit Ödeme: " + getAmount() + " TL";
    }
}
