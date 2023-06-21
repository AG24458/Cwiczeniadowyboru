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

    /**
     * dodaje nowy  produkt do koszyka
     *
     * @param  name nazwa przedmiotu
     */
    public void dodajPrzedmiot(String name){

        products.add(new Produkt(name));
        logger.debug("Dodano " + name + " do koszyka.");

    }


    /**
     * tworzy zamowienie z produktow w koszyku a nastepnie usuwa je z koszyka
     *
     * @return  Zamowienie
     */
    public Zamowienie zamow(){
        ArrayList<Produkt> produkty = new ArrayList<>(products);
        products.clear();

        logger.debug("Złożono zamówienie.");

        return new Zamowienie(user, produkty);
    }
}
