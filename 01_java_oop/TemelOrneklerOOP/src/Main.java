import model.Task;
import services.LibraryManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\n1. Görev Ekle");
            System.out.println("2. Görevleri Listele");
            System.out.println("3. Görevi Tamamla");
            System.out.println("4. Görev Sil");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminiz: ");
            String choice = scanner.nextLine();

            if(choice.equals("1")){
                System.out.println("Görev Açıklaması: ");
                String desc = scanner.nextLine();
                tasks.add(new Task(desc));
                System.out.println("Görev eklendi.");
            }else if(choice.equals("2")){
                if (tasks.isEmpty()){
                    System.out.println("Hiç görev yok");
                }else{
                    for(int i = 0; i< tasks.size();i++){
                        System.out.println((i+1) + "." + tasks.get(i));
                    }
                }
            }else if(choice.equals(("3"))){
                System.out.println("Tamamlanacak görev numarası: ");
                int index = Integer.parseInt(scanner.nextLine()) - 1;
                if(index>=0 && index< tasks.size()){
                    tasks.get(index).markDone();
                    System.out.println("Görev tamamlandı");
                }else {
                    System.out.println("Geçersiz numara");
                }
            }else if (choice.equals("4")){
                System.out.println("Silinecek görev numarası: ");
                int index = Integer.parseInt(scanner.nextLine())-1;
                if(index>=0 && index< tasks.size()){
                    tasks.remove(index);
                    System.out.println("Görev silindi");
                }else {
                    System.out.println("Geçersiz numara");
                }
            }else if(choice.equals("5")){
                System.out.println("Görüşmek üzere!");
                break;
            }else{
                System.out.println("Geçersiz seçim");
            }
        }
    }
}



//Studen sınıfı için
 /*
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while(true) {
            System.out.println("\n1. Öğrenci ekle");
            System.out.println("2. Öğrencileri Listele");
            System.out.println("3. Öğrenci Sil");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("İsim: ");
                    String name = scanner.nextLine();

                    System.out.print("Numara: ");
                    String idStr = scanner.nextLine();

                    try {
                        int id = Integer.parseInt(idStr);
                        manager.addStudent(name, id);
                    } catch (NumberFormatException e) {
                        System.out.println("Hatalı numara girdiniz. Lütfen sadece rakam kullanın.");
                    }
                    break;

                case 2:
                    manager.listStudents();
                    break;
                case 3:
                    System.out.print("Silinecek öğrenci numarası: ");
                    int deletedId = scanner.nextInt();
                    scanner.nextLine();
                    manager.removeStudent(deletedId);
                    break; // Bu break eklendi
                case 4:
                    System.out.println("Çıkılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçim");
            }
        }

         */




//Library sınıfı
/*
     Scanner scanner = new Scanner(System.in);
        LibraryManager libraryManager = new LibraryManager();

        while(true) {
            System.out.println("\n1. Kitap Ekle");
            System.out.println("2. Kitapları Listele");
            System.out.println("3. Kitap Sil");
            System.out.println("4. Kategoriye Göre Listele");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminiz: ");

            int choice;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lütfen geçerli bir sayı girin");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Kitap Adı: ");
                    String title = scanner.nextLine();
                    System.out.print("Yazar: ");
                    String author = scanner.nextLine();
                    System.out.print("Kategori: ");
                    String category = scanner.nextLine();
                    libraryManager.addBook(title, author, category);
                    break;
                case 2:
                    libraryManager.listBooks();
                    break;
                case 3:
                    System.out.print("Silinecek Kitap adı: ");
                    String delTitle = scanner.nextLine();
                    libraryManager.removeBook(delTitle);
                    break;  // Burada break eksikti
                case 4:
                    System.out.print("Kategori: ");
                    String cat = scanner.nextLine();
                    libraryManager.listBooksByCategory(cat);
                    break;  // Burada break eksikti
                case 5:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçim.");
            }
        }
 */