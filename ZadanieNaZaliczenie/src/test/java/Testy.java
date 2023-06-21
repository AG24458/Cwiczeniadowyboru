import org.example.Package1.Uzytkownik;
import org.example.Package2.Koszyk;
import org.example.Package2.Produkt;
import org.example.Package2.Zamowienie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testy {
    @Test
    public void testDodajProdukt() {
        Uzytkownik testUser = new Uzytkownik("testuser");
        Koszyk koszyk = new Koszyk(testUser);

        koszyk.dodajPrzedmiot("Testowy przedmiot");

        Assertions.assertEquals(koszyk.products.size(), 1);
    }

    @Test
    public void testZamow() {
        Uzytkownik testUser = new Uzytkownik("testuser");
        Koszyk koszyk = new Koszyk(testUser);
        koszyk.products.add(new Produkt("testowy produkt 1"));
        koszyk.products.add(new Produkt("testowy produkt 2"));
        Zamowienie zamowienie = koszyk.zamow();

        Assertions.assertEquals(koszyk.products.size(), 0);
        Assertions.assertEquals(zamowienie.products.size(), 2);
    }


}
