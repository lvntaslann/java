package service;

import model.Personel;
import model.PrimHesaplayabilir;
import model.RaporOlusturabilir;

import java.util.ArrayList;
import java.util.List;

public class PersonelService {
    private List<Personel> personeller = new ArrayList<>();

    public void personelEkle(Personel personel){
        personeller.add(personel);
        System.out.println(personel.getClass().getSimpleName() + " eklendi: "+ personel.getAd());
    }
    public void personelleriListele() {
        if (personeller.isEmpty()){
            System.out.println("Personel yok.");
        }
        for (Personel p : personeller) {
            System.out.println("ID: " + p.getId() + ", Ad: " + p.getAd() + ", Maaş: " + p.maasHesapla());

            if (p instanceof PrimHesaplayabilir primPersonel) {
                System.out.println("Prim: " + primPersonel.primHesapla());
            }

            if (p instanceof RaporOlusturabilir raporPersonel) {
                System.out.println("Rapor: " + raporPersonel.raporOlustur());
            }
        }
    }


    public void personelSil(int id){
        boolean silindi = personeller.removeIf(p-> p.getId()==id);
        if(silindi){
            System.out.println("ID'si " + id + " olan personel silindi");
        }else{
            System.out.println("Böyle bir ID bulunamadı");
        }
    }
}
