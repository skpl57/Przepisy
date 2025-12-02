package com.example.skprzepisy;

import java.util.ArrayList;

public class Przepisy {
    private String nazwaPrzepisu;
    private String kategoria;
    private int idObrazka;
    private ArrayList<String> skladniki = new ArrayList<>();
    private String opis;

    public Przepisy(String nazwaPrzepisu) {
        this.nazwaPrzepisu = nazwaPrzepisu;
        kategoria = "ciasta";
        idObrazka = R.drawable.piernik;
        skladniki = new ArrayList<>();
        opis = "";
    }

    public Przepisy(String nazwaPrzepisu, String kategoria, int idObrazka, ArrayList<String> skladniki, String opis) {
        this.nazwaPrzepisu = nazwaPrzepisu;
        this.kategoria = kategoria;
        this.idObrazka = idObrazka;
        this.skladniki = skladniki;
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "Przepisy{" +
                "nazwaPrzepisu='" + nazwaPrzepisu + '\'' +
                '}';
    }

    public String getNazwaPrzepisu() {
        return nazwaPrzepisu;
    }

    public String getKategoria() {
        return kategoria;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public ArrayList<String> getSkladniki() {
        return skladniki;
    }

    public String getOpis() {
        return opis;
    }
}
