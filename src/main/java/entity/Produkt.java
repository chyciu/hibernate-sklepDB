package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "sklep", name = "produkt")

public class Produkt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_produktu")
    private long id_produktu;
    @Column (name = "nazwa")
    private String nazwa;
    @Column (name = "cena")
    private Double cena;

    @ManyToOne
    @JoinColumn(name = "id_producenta")
    private Producent producent;

    @ManyToOne
    @JoinColumn(name = "id_kategorii")
    private Kategoria_produktu kategoria_produktu;

    @ManyToMany (mappedBy = "produkty")
    private List<Klient> klienci;


    public Produkt() {
    }

    public long getId_produktu() {
        return id_produktu;
    }

    public void setId_produktu(long id_produktu) {
        this.id_produktu = id_produktu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }


    public Producent getProducent() {
        return producent;
    }

    public void setProducent(Producent producent) {
        this.producent = producent;
    }

    public Kategoria_produktu getKategoria_produktu() {
        return kategoria_produktu;
    }

    public void setKategoria_produktu(Kategoria_produktu kategoria_produktu) {
        this.kategoria_produktu = kategoria_produktu;
    }

    public Produkt(String nazwa, Double cena, Producent producent, Kategoria_produktu kategoria_produktu) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.producent = producent;
        this.kategoria_produktu = kategoria_produktu;
    }
}
