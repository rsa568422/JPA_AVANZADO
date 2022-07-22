package org.formacion.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.formacion.jpa.domain.Coche;
import org.formacion.jpa.domain.Persona;

public class Main {

    public static void main(String[] args) throws Exception {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_main");

        Persona ana = new Persona();
        ana.setNombre("Ana");
        
        Coche coche = new Coche();
        coche.setModelo("suzuki");
        coche.setPropietario(ana);
        
        Persona juan = new Persona();
        juan.setNombre("Juan");
        
        juan.getCoches().add(coche);

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(ana);
        em.persist(coche);
        em.persist(juan);
  
        em.refresh(coche);
        System.out.println("propietario " + coche.getPropietario().getNombre());

        em.getTransaction().commit();
        em.close();

        emf.close();
   
    }

}
