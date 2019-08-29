package dodawanie;

import entity.Adres;
import entity.Kategoria_produktu;
import entity.Klient;
import org.hibernate.Session;

public class CustomerCreate {

    public static void main(String[] arg) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();




        Kategoria_produktu kategoria_produktu = new Kategoria_produktu();
        session.persist(kategoria_produktu);
        session.flush();
        session.close();
    }


}
