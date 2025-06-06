package model;

public class Bolme implements Islem{
    @Override
    public double hesapla(double a, double b) {
        if(b==0){
            System.out.println("Sıfıra bölme hatası");
            return 0;
        }else {
            return a / b;
        }
    }
}
