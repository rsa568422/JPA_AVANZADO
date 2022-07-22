package org.formacion.jpa.main;

import java.util.Collection;
import java.util.HashSet;

import org.formacion.jpa.domain.Persona;

public class Main {

    public static void main(String[] args) throws Exception {

        Persona pepe = new Persona("pepe");
        Collection<Persona> col = new HashSet<>();
        col.add(pepe);
        
        pepe.setNombre("jose");
        System.out.println(col.contains(pepe));
        
    }

}
