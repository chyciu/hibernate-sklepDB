package entity;

import javax.persistence.*;

@Entity
@Table(schema = "sklep", name = "adres")

public class Adres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_adres")
    private long id_adres;
    @Column (name = "ulica")
    private String ulica;
    @Column (name = "nr_domu")
    private String nrDomu;
    @Column (name = "nr_mieszkania")
    private String nrMieszkania;
    @Column (name = "kod_pocztowy")
    private String kodPocztowy;
    @Column (name = "miejscowosc")
    private String miejscowosc;

    @OneToOne
    @JoinColumn(name = "id_klient", unique = true)
    //Strona posiadajaca relacje
    private Klient klient;


    public Adres() {
    }

    public long getId_adres() {
        return id_adres;
    }

    public void setId_adres(long id_adres) {
        this.id_adres = id_adres;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(String nrDomu) {
        this.nrDomu = nrDomu;
    }

    public String getNrMieszkania() {
        return nrMieszkania;
    }

    public void setNrMieszkania(String nrMieszkania) {
        this.nrMieszkania = nrMieszkania;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }


    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }


    public Adres(String ulica, String nrDomu, String nrMieszkania, String kodPocztowy, String miejscowosc) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.nrMieszkania = nrMieszkania;
        this.kodPocztowy = kodPocztowy;
        this.miejscowosc = miejscowosc;
    }
}

