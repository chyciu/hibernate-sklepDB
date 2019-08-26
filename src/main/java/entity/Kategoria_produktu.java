package entity;

import javax.persistence.*;

@Entity
@Table(schema = "sklep", name = "kategoria_produktu")

public class Kategoria_produktu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id_kategorii;
    @Column
    private String nazwa;

    @OneToMany(cascade = CascadeType.ALL)

    //Strona posiadajaca relacje
    private Produkt produkt;

    public Kategoria_produktu() {
    }

    public long getId_kategorii() {
        return id_kategorii;
    }

    public void setId_kategorii(long id_kategorii) {
        this.id_kategorii = id_kategorii;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }
}
