package model;

public abstract class Personel {
    protected String ad;
    protected int id;

    public Personel(String ad,int id){
        this.ad = ad;
        this.id = id;
    }

    public String getAd(){
        return ad;
    }
    public int getId(){
        return id;
    }

    public abstract double maasHesapla();
}
