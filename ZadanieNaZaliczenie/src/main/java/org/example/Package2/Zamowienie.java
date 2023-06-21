package org.example.Package2;

import org.example.Package1.Uzytkownik;

import java.util.ArrayList;

public class Zamowienie {
    private Uzytkownik user;
    public ArrayList<Produkt> products;
    public Zamowienie(Uzytkownik uzytkownik, ArrayList<Produkt> produkty) {
        user = uzytkownik;
        products = produkty;
    }
}
