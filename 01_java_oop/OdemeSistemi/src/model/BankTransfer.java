package model;

public class BankTransfer extends PaymentMethod {
    private String iban;

    public BankTransfer(double amount, String iban) {
        super(amount);
        this.iban = iban;
    }

    @Override
    public void processPayment() {
        if (iban.length() < 5) {
            System.out.println("Geçersiz IBAN!");
            return;
        }
        System.out.println("Banka havalesiyle " + getAmount() + " TL gönderildi. IBAN: " + iban);
        setSuccess(true);
    }

    @Override
    public String toString() {
        return "Banka Havalesi: " + getAmount() + " TL, IBAN: " + iban;
    }
}
