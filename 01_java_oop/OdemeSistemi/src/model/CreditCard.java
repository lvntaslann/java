package model;

public class CreditCard extends PaymentMethod {
    private String cardNumber;

    public CreditCard(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        if (cardNumber.length() != 5 || !cardNumber.matches("\\d+")) {
            System.out.println("Geçersiz kart numarası!");
            return;
        }
        System.out.println("Kredi kartıyla " + getAmount() + " TL ödeme yapıldı. Kart: " + cardNumber);
        setSuccess(true);
    }

    @Override
    public String toString() {
        return "Kredi Kartı Ödemesi: " + getAmount() + " TL, Kart: " + cardNumber;
    }
}
