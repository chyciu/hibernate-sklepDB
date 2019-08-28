package entity;

import javax.persistence.*;

@Entity
@Table(schema = "sklep", name = "producent")

public class Producent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id_producenta;
    @Column
    private String nazwa;

    @OneToMany(mappedBy = "id_producenta")
    private Produkt produkt;


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
}
