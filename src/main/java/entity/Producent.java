package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "sklep", name = "producent")

public class Producent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_producenta")
    private long id_producenta;
    @Column (name = "nazwa")
    private String nazwa;

    @OneToMany(mappedBy = "producent")
    private List<Produkt> produkty;


    public Producent() {
    }

    public long getId_producenta() {
        return id_producenta;
    }

    public void setId_producenta(long id_producenta) {
        this.id_producenta = id_producenta;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Producent(String nazwa) {
        this.nazwa = nazwa;
    }
}
