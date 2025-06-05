package model;

public class YariZamanliPersonel extends Personel implements RaporOlusturabilir{
    private double saatlikUcret;
    private int calismaSaati;

    public YariZamanliPersonel(String ad, int id, double saatlikUcret,int calismaSaati){
        super(ad,id);
        this.saatlikUcret=saatlikUcret;
        this.calismaSaati=calismaSaati;
    }
    @Override
    public double maasHesapla(){
        return saatlikUcret*calismaSaati;
    }

    @Override
    public String raporOlustur() {
        return "Personel: " + ad + " - ID: " + id + " - Maaş: " + maasHesapla();
    }
}
