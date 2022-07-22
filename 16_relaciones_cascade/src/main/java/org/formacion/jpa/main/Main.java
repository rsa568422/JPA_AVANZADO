package org.formacion.jpa.main;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.formacion.jpa.domain.Coche;
import org.formacion.jpa.domain.Persona;

public class Main {

    public static void main(String[] args) throws Exception {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_main");

        Connection con = DriverManager.getConnection("jdbc:h2:mem:test");
        con.createStatement().executeUpdate("insert into persona (nombre) values ('juan')");
        con.createStatement().executeUpdate("insert into persona (nombre) values ('ana')");
        con.createStatement().executeUpdate("insert into persona (nombre) values ('luis')");
        con.commit();
        con.close();
        
        Coche coche = new Coche();
        Persona nuevaPersona = new Persona("Miguel");
        coche.setPropietario(nuevaPersona);
        
        EntityManager em = emf.createEntityManager();
        
        // tx 1
        em.getTransaction().begin();

        em.persist(nuevaPersona);
        em.persist(coche);
        
        em.getTransaction().commit();
        em.close();
        
        System.out.println("segunda tx");
        
        // tx 2
        coche.setPropietario(new Persona("Antonia"));
        
        em = emf.createEntityManager();
        em.getTransaction().begin();

        em.merge(coche);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
   
    }

}
