package org.example.Package2;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.example.Package1.Uzytkownik;

import java.util.ArrayList;

public class Koszyk {
    private Uzytkownik user;
    public ArrayList<Produkt> products;
    private Logger logger = LogManager.getLogger(Koszyk.class);

    public Koszyk(Uzytkownik uzytkownik) {
        user = uzytkownik;
        products = new ArrayList<>();

        logger.debug("Stworzono nowy koszyk");

    }

    public void dodajPrzedmiot(String name){

        products.add(new Produkt(name));
        logger.debug("Dodano " + name + " do koszyka.");

    }

    public Zamowienie zamow(){
        ArrayList<Produkt> produkty = new ArrayList<>(products);
        products.clear();

        logger.debug("Złożono zamówienie.");

        return new Zamowienie(user, produkty);
    }
}
