package dodawanie;

import entity.*;

public class Main {

    public static void main(String[] args) {
        SklepCRUD sklepCRUD = new SklepCRUD();

        //tworzenie 5 klientów razem z ich adresami

        Adres adres1 = new Adres("Główna", "2", "13", "80-111", "Sopot");
        Adres adres2 = new Adres("Konopacka", "1", "33", "88-101", "Gdynia");
        Adres adres3 = new Adres("Nowa", "12", "1", "82-198", "Gdynia");
        Adres adres4 = new Adres("Polska", "34", "12", "89-100", "Rumia");
        Adres adres5 = new Adres("Wiejska", "23", "23", "88-090", "Reda");

        Klient klient1 = new Klient("Jan", "Kowalski", "234323322");
        Klient klient2 = new Klient("Tomasz", "Nowak", "234454333");
        Klient klient3 = new Klient("Anna", "Jagodzinska", "87865655");
        Klient klient4 = new Klient("Ewa", "Pierwsza", "466575744");
        Klient klient5 = new Klient("Roman", "Gogol", "5673939393");

        //tworzymy kategorie produktów

        Kategoria_produktu kategoria1 = new Kategoria_produktu("Rower");
        Kategoria_produktu kategoria2 = new Kategoria_produktu("Samochód");
        Kategoria_produktu kategoria3 = new Kategoria_produktu("Samolot");

        //tworzymy producentów

        Producent producent1 = new Producent("MazuryBike");
        Producent producent2 = new Producent("VIP");

        //przypisujemy adresy do klientów

        adres1.setKlient(klient1);
        adres2.setKlient(klient2);
        adres3.setKlient(klient3);
        adres4.setKlient(klient4);
        adres5.setKlient(klient5);

        //tworzymy 10 produktów

        Produkt produkt1 = new Produkt("Wigry", 2344.0, producent1, kategoria1);
        Produkt produkt2 = new Produkt("Kross", 4566.0, producent1, kategoria1);
        Produkt produkt3 = new Produkt("Jamno", 345.0, producent1, kategoria1);
        Produkt produkt4 = new Produkt("MB", 95456.0, producent2, kategoria2);
        Produkt produkt5 = new Produkt("Volvo", 98999.0, producent2, kategoria2);
        Produkt produkt6 = new Produkt("Jeep", 120455.0, producent2, kategoria2);
        Produkt produkt7 = new Produkt("Fly", 500000.0, producent2, kategoria3);
        Produkt produkt8 = new Produkt("SpeedBird", 1500000.0, producent2, kategoria3);
        Produkt produkt9 = new Produkt("Kolarz", 12000.0, producent1, kategoria1);
        Produkt produkt10 = new Produkt("BoyBike", 900.0, producent1, kategoria1);

        //tworzymy 15 rekrów do listy produktów - tabela łaczoca klienta z produktem

        klient1.getProdukty().add(produkt1);
        klient1.getProdukty().add(produkt4);
        klient1.getProdukty().add(produkt3);

        klient2.getProdukty().add(produkt5);
        klient2.getProdukty().add(produkt10);
        klient2.getProdukty().add(produkt2);

        klient3.getProdukty().add(produkt7);
        klient3.getProdukty().add(produkt9);
        klient3.getProdukty().add(produkt1);

        klient4.getProdukty().add(produkt10);
        klient4.getProdukty().add(produkt8);
        klient4.getProdukty().add(produkt2);

        klient5.getProdukty().add(produkt8);
        klient5.getProdukty().add(produkt5);
        klient5.getProdukty().add(produkt5);

        sklepCRUD.createNewObject(klient1);
        sklepCRUD.createNewObject(klient2);
        sklepCRUD.createNewObject(klient3);
        sklepCRUD.createNewObject(klient4);
        sklepCRUD.createNewObject(klient5);

        sklepCRUD.createNewObject(kategoria1);
        sklepCRUD.createNewObject(kategoria2);
        sklepCRUD.createNewObject(kategoria3);

        sklepCRUD.createNewObject(producent1);
        sklepCRUD.createNewObject(producent2);

        sklepCRUD.createNewObject(produkt1);
        sklepCRUD.createNewObject(produkt2);
        sklepCRUD.createNewObject(produkt3);
        sklepCRUD.createNewObject(produkt4);
        sklepCRUD.createNewObject(produkt5);
        sklepCRUD.createNewObject(produkt6);
        sklepCRUD.createNewObject(produkt7);
        sklepCRUD.createNewObject(produkt8);
        sklepCRUD.createNewObject(produkt8);
        sklepCRUD.createNewObject(produkt9);
        sklepCRUD.createNewObject(produkt10);


    }
}
