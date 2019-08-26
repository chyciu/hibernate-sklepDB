package entity;

import javax.persistence.*;

@Entity
@Table(schema = "sklep", name = "klient")


public class Klient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id_klient;
    @Column
    private String imie;
    @Column
    private String nazwisko;
    @Column
    private String telefon;


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
}
