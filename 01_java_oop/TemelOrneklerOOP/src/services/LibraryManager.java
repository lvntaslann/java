package services;
import model.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryManager {
    private List<Book> books = new ArrayList<>();

    public void addBook(String title,String author, String category){
        books.add(new Book(title,author,category));
        System.out.println("Kitap eklendi.");
    }

    public void listBooks(){
        if(books.isEmpty()){
            System.out.println("Kütüphanede kitap yok");
            return;
        }else{
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void removeBook(String title) {
        boolean removed = books.removeIf(b -> b.getTitle().equalsIgnoreCase(title));
        if (removed) {
            System.out.println("Kitap silindi.");
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }
    public void listBooksByCategory(String category){
        List<Book> filtered = books.stream().filter(b->b.getCategory().equalsIgnoreCase(category)).collect(Collectors.toList());
        if (filtered.isEmpty()){
            System.out.println("Bu kategoride kitap bulunamadı.");
            return;
        }
        for (Book b: filtered){
            System.out.println(b);
        }
    }
}
