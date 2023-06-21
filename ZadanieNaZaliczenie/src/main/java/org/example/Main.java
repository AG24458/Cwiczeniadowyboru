package org.example;

import org.apache.log4j.BasicConfigurator;
import org.example.Package1.Uzytkownik;
import org.example.Package2.Koszyk;
import org.example.Package2.Zamowienie;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        BasicConfigurator.configure();

        Uzytkownik user = new Uzytkownik("user1");
        Koszyk koszyk = new Koszyk(user);

        koszyk.dodajPrzedmiot("Swiece zapachowe");
        koszyk.dodajPrzedmiot("Granulat dla gekonów");
        koszyk.dodajPrzedmiot("Wahacz Lewy Przód Bmw E46");

        Zamowienie order = koszyk.zamow();

        System.out.println(order);
    }
}