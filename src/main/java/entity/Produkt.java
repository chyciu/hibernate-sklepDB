package entity;

import javax.persistence.*;

@Entity
@Table(schema = "sklep", name = "produkt")

public class Produkt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id_produktu;
    @Column
    private String nazwa;
    @Column
    private String cena;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_producenta")
    private Producent producent;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_kategorii")
    private Kategoria_produktu kategoria_produktu;


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

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
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
}
