package br.com.brunoid.controllers;

import br.com.brunoid.models.Pessoa;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class PessoaController {
    public SessionFactory sessionFactory;
    
    public void setup() {
        System.out.println("##### SETUP");
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception ex) {
            System.out.println("##### CAIU NA EXCEÇÃO");
            StandardServiceRegistryBuilder.destroy(registry);
            System.out.println("###################");
            throw new RuntimeException(ex);
        }
    }
    
    public void exit() {

    }
    
    public void create() {
        Pessoa p = new Pessoa();
        p.setNome("Van Damme");
        p.setNascimento("1982-10-26");
 
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(p);

        session.getTransaction().commit();
        session.close();
    }
    
    public void read() {
        Session session = sessionFactory.openSession();
 
        int pessoaId = 1;
        Pessoa pessoa = session.get(Pessoa.class, pessoaId);

        System.out.println(pessoa.toString());
        session.close();

    }
    
    public void update() {
        Pessoa p = new Pessoa();
        p.setPessoaId(3);
        p.setNome("Juvenal");
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.update(p);

        session.getTransaction().commit();
        session.close();
    
    }
    
    public void delete() {
        Pessoa p = new Pessoa();
        p.setPessoaId(1);

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.delete(p);

        session.getTransaction().commit();
        session.close();
    }
    
}
