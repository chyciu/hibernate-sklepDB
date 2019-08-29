package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "sklep", name = "kategoria_produktu")

public class Kategoria_produktu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_kategorii")
    private long id_kategorii;
    @Column (name = "nazwa")
    private String nazwa;

    @OneToMany (mappedBy = "kategoria_produktu")
    //Strona posiadajaca relacje
    private List<Produkt> produkt;


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

    public Kategoria_produktu(String nazwa) {
        this.nazwa = nazwa;
    }
}

