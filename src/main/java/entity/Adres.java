package entity;

import javax.persistence.*;

@Entity
@Table(schema = "sklep", name = "adres")

public class Adres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id_adres;
    @Column
    private String ulica;
    @Column
    private String nrDomu;
    @Column
    private String nrMieszkania;
    @Column
    private String kodPocztowy;
    @Column
    private String miejscowosc;

    @OneToOne(cascade = CascadeType.ALL)
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
}

