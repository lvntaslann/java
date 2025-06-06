import enums.IslemTuru;
import model.Islem;
import model.IslemFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Hesap Makinesi ---");
            System.out.println("1. Toplama");
            System.out.println("2. Çıkarma");
            System.out.println("3. Çarpma");
            System.out.println("4. Bölme");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminiz: ");
            String secim = scanner.nextLine();

            if (secim.equals("5")) break;

            System.out.print("İlk sayı: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.print("İkinci sayı: ");
            double b = Double.parseDouble(scanner.nextLine());

            IslemTuru tur = switch (secim) {
                case "1" -> IslemTuru.TOPLAMA;
                case "2" -> IslemTuru.CIKARTMA;
                case "3" -> IslemTuru.CARPMA;
                case "4" -> IslemTuru.BOLME;
                default -> null;
            };

            if (tur != null) {
                Islem islem = IslemFactory.getIslem(tur);
                double sonuc = islem.hesapla(a, b);
                System.out.println("Sonuç: " + sonuc);
            } else {
                System.out.println("Geçersiz işlem türü.");
            }
        }
    }
}
