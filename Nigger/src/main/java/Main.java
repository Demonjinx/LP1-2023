import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa ("Mateus", "Mendonça", "mateusacdem@gmail.com");
        Pessoa p2 = new Pessoa("Thomas", "Turbano", "Thomasturbano@gmail.com");
        Pessoa p3 = new Pessoa("Carlos", "magno", "carlinmilgrau@gmail.com");
        Pessoa p4 = new Pessoa("Dzueineirinha", "Dorlas", "Psuedoanonimo@gmail.com");

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();


        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("From Pessoa",Pessoa.class).list();

        pessoas.forEach(pessoa -> System.out.println(pessoa));

    }

}
