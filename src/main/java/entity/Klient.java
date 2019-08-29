package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = "sklep", name = "klient")


public class Klient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_klient")
    private long id_klient;
    @Column (name = "imie")
    private String imie;
    @Column (name = "nazwisko")
    private String nazwisko;
    @Column (name = "telefon")
    private String telefon;

    @OneToOne (mappedBy = "klient", cascade = CascadeType.ALL)
    private Adres adres;

    @ManyToMany
    @JoinTable (name = "klient_produkt",
        joinColumns = @JoinColumn (name = "id-klienta"),
        inverseJoinColumns = @JoinColumn (name = "id_produkt"))
    private List <Produkt> produkty;

    public Klient() {
    }

    public long getId_klient() {
        return id_klient;
    }

    public void setId_klient(long id_klient) {
        this.id_klient = id_klient;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public List<Produkt> getProdukty() {
        if (produkty == null) {
            produkty = new ArrayList<Produkt>();
        }
        return produkty;
    }

    public Klient(String imie, String nazwisko, String telefon, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
        this.adres = adres;
    }
}
