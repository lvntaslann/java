import model.*;
import service.PersonelService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonelService personelService = new PersonelService();

        while (true) {
            System.out.println("\n--- Personel Yönetim Sistemi ---");
            System.out.println("1. Personel Ekle");
            System.out.println("2. Personelleri Listele");
            System.out.println("3. Personel Sil");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");
            String secim = scanner.nextLine();

            switch (secim) {
                case "1":
                    System.out.println("1. Tam Zamanlı");
                    System.out.println("2. Yarı Zamanlı");
                    System.out.println("3. Stajyer");
                    System.out.print("Türü seçin: ");
                    String tur = scanner.nextLine();

                    System.out.print("Adı: ");
                    String ad = scanner.nextLine();
                    System.out.print("ID: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    switch (tur) {
                        case "1":
                            System.out.print("Aylık Maaş: ");
                            double maas = Double.parseDouble(scanner.nextLine());
                            personelService.personelEkle(new TamZamanliPersonel(ad, id, maas));
                            break;
                        case "2":
                            System.out.print("Saatlik Ücret: ");
                            double saatlik = Double.parseDouble(scanner.nextLine());
                            System.out.print("Çalışma Saati: ");
                            int saat = Integer.parseInt(scanner.nextLine());
                            personelService.personelEkle(new YariZamanliPersonel(ad, id, saatlik, saat));
                            break;
                        case "3":
                            System.out.print("Günlük Ücret: ");
                            double gunluk = Double.parseDouble(scanner.nextLine());
                            System.out.print("Çalışma Günü: ");
                            int gun = Integer.parseInt(scanner.nextLine());
                            personelService.personelEkle(new Stajyer(ad, id, gunluk, gun));
                            break;
                        default:
                            System.out.println("Geçersiz tür.");
                    }
                    break;
                case "2":
                    personelService.personelleriListele();
                    break;
                case "3":
                    System.out.print("Silinecek personelin ID'si: ");
                    int silinecekId = Integer.parseInt(scanner.nextLine());
                    personelService.personelSil(silinecekId);
                    break;
                case "4":
                    System.out.println("Çıkış yapılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}
