import model.EmailNotification;
import model.Notification;
import model.PushNotification;
import model.SMSNotification;
import service.NotificationService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NotificationService notificationService = new NotificationService();

        while(true){
            System.out.println("\n1. Bildirim Gönder");
            System.out.println("2. Geçmişi Göster");
            System.out.println("3. Çıkış");
            System.out.print("Seçiminiz: ");
            String secim = scanner.nextLine();
            if (secim.equals("1")){
                System.out.println("Mesahi girin: ");
                String mesaj = scanner.nextLine();
                System.out.println("Yöntemi seçin:");
                System.out.println("1. Email");
                System.out.println("2. SMS");
                System.out.println("3. Push Bildirimi");
                String yontem = scanner.nextLine();

                Notification notification = null;

                switch (yontem){
                    case "1":
                        System.out.println("Email adresi: ");
                        String email = scanner.nextLine();
                        notification = new EmailNotification(mesaj,email);
                        break;
                    case "2":
                        System.out.println("Telefon numarası :");
                        String telefonNumarasi = scanner.nextLine();
                        notification = new SMSNotification(mesaj,telefonNumarasi);
                        break;
                    case "3":
                        System.out.println("Cihaz ID: ");
                        String cihazID = scanner.nextLine();
                        notification = new PushNotification(mesaj,cihazID);
                        break;
                    default:
                        System.out.println("Geçersiz seçim!");
                }
                if (notification!=null){
                    notificationService.sendNotification(notification);
                }
            } else if (secim.equals("2")) {
                notificationService.showHistory();
            } else if (secim.equals("3")) {
                System.out.println("Çıkılıyor...");
                break;
            }else{
                System.out.println("Geçersiz seçim");
            }
        }
    }
}