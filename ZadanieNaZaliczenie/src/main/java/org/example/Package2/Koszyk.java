package org.example.Package2;

import org.example.Package1.Uzytkownik;

import java.util.ArrayList;

public class Koszyk {
    private Uzytkownik user;
    public ArrayList<Produkt> products;

    public Koszyk(Uzytkownik uzytkownik) {
        user = uzytkownik;
        products = new ArrayList<>();
    }

    public void dodajPrzedmiot(String name){
        products.add(new Produkt(name));
    }

    public Zamowienie zamow(){
        ArrayList<Produkt> produkty = new ArrayList<>(products);
        products.clear();

        return new Zamowienie(user, produkty);
    }
}
