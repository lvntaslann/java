package model;

import enums.IslemTuru;

public class IslemFactory {
    public static Islem getIslem(IslemTuru tur) {
        return switch (tur) {
            case TOPLAMA -> new Toplama();
            case CIKARTMA -> new Cikartma();
            case CARPMA -> new Carpma();
            case BOLME -> new Bolme();
        };
    }
}
