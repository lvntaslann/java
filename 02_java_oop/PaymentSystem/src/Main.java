import model.*;
import service.PaymentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentService paymentService = new PaymentService();

        while (true) {
            System.out.println("\nTutarı girin: ");
            double amount;
            try {
                amount = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lütfen geçerli bir sayı girin.");
                continue;
            }

            System.out.println("\nÖdeme Yöntemi Seçin:");
            System.out.println("1. Kredi Kartı");
            System.out.println("2. Banka Havalesi");
            System.out.println("3. Nakit");
            System.out.println("4. Ödeme Geçmişi");
            System.out.println("5. Çıkış");

            String choice = scanner.nextLine();
            PaymentMethod method = null;

            switch (choice) {
                case "1":
                    System.out.println("Kart numarası (16 hane):");
                    String cardNumber = scanner.nextLine();
                    method = new CreditCard(amount, cardNumber);
                    break;
                case "2":
                    System.out.println("IBAN:");
                    String iban = scanner.nextLine();
                    method = new BankTransfer(amount, iban);
                    break;
                case "3":
                    method = new Cash(amount);
                    break;
                case "4":
                    paymentService.getPaymentHistory();
                    continue;
                case "5":
                    System.out.println("Programdan çıkılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim!");
                    continue;
            }

            paymentService.makePayment(method);
        }
    }
}
