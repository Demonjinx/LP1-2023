import entity.Endereco;
import entity.Pedidos;
import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Endereco e1 = new Endereco("Rua Marcos Leonardo", "Mousecity");
        Endereco e2 = new Endereco("Rua Azir Antônio", "Shurima");
        Endereco e3 = new Endereco("Rua Enjúa", "Entúpi");
        Endereco e4 = new Endereco("Rua Celso Garcia", "Pindamonhagaba");

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

/*
        session.persist(e1);
        session.persist(e2);
        session.persist(e3);
        session.persist(e4);

        transaction.commit();

        List<Endereco> enderecos = session.createQuery("from endereco",Endereco.class).list();

        enderecos.forEach(endereco -> System.out.println(endereco));

*/
        Pessoa p1 = new Pessoa ("Mateus", "Mendonça", "mateusacdem@gmail.com", e1);
        Pessoa p2 = new Pessoa("Thomas", "Turbs", "ThomasTurbs@gmail.com", e2);
        Pessoa p3 = new Pessoa("Carlos", "magno", "carlinmilgrau@gmail.com", e3);
        Pessoa p4 = new Pessoa("Dzueineirinha", "Dorlas", "Psuedoanonimo@gmail.com", e4);

        //transaction = session.beginTransaction();

/*
        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa",Pessoa.class).list();

        pessoas.forEach(pessoa -> System.out.println(pessoa));

*/


/*
        Pedidos pe1 = new Pedidos(p1, );
        Pedidos pe2 = new Pedidos(p2, );
        Pedidos pe3 = new Pedidos(p3, );
        Pedidos pe4 = new Pedidos(p4, );

        session.persist(pe1);
        session.persist(pe2);
        session.persist(pe3);
        session.persist(pe4);

        List<Pedidos> pedidos = session.createQuery("from Pedidos",Pedidos.class).list();

        pedidos.forEach(Pedidos -> System.out.println(pedidos));

*/



    }

}
