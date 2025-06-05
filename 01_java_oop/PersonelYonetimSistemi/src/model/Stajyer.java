package model;

public class Stajyer extends Personel  implements RaporOlusturabilir{
    private double gunlukUcret;
    private int calismaGunu;

    public Stajyer(String ad,int id,double gunlukUcret,int calismaGunu){
        super(ad,id);
        this.calismaGunu=calismaGunu;
        this.gunlukUcret=gunlukUcret;
    }
    @Override
    public double maasHesapla(){
        return gunlukUcret*calismaGunu;
    }
    public String raporOlustur() {
        return "Personel: " + ad + " - ID: " + id + " - Maaş: " + maasHesapla();
    }
}
