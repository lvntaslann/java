package model;

public  class TamZamanliPersonel extends Personel implements PrimHesaplayabilir, RaporOlusturabilir {
    private double aylikMaas;

    public TamZamanliPersonel(String ad,int id,double aylikMaas){
        super(ad,id);
        this.aylikMaas=aylikMaas;
    }

    @Override
    public double maasHesapla() {
        return aylikMaas;
    }

    @Override
    public double primHesapla() {
        return aylikMaas*0.1;
    }

    @Override
    public String raporOlustur() {
        return "Personel: " + ad + " - ID: " + id + " - Maaş: " + aylikMaas;
    }
}
