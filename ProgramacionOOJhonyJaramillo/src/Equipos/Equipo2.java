
package Equipos;

import java.util.HashMap;


public class Equipo2 {
    public static void main(String[] args) {
        HashMap<Integer, String>barcelona=new HashMap<>();
        barcelona.put(1,"Banguera");
        System.out.println(barcelona.get(1));
        barcelona.put(2,"Velasco");
        barcelona.put(3,"Aimar");
        barcelona.put(4,"Gonzales");
        barcelona.put(5,"Diaz");
        barcelona.put(6,"Alvez");
        barcelona.put(7,"Campana");
        barcelona.put(8,"Martinez");
        barcelona.put(9,"Pineida");
        barcelona.put(10,"Herazo");
        HashMap<Integer, String>ligaQuito=new HashMap<>();
        ligaQuito.put(1,"Gabarini");
        ligaQuito.put(2,"Quinteros");
        ligaQuito.put(3,"Orejuela");
        ligaQuito.put(4,"Rodriguez");
        ligaQuito.put(5,"Valencia");
        ligaQuito.put(6,"Chicaiza");
        ligaQuito.put(7,"Caicedo");
        if (barcelona.size() > ligaQuito.size() ) {
            System.out.println("Barcelona");
        } else {
            System.out.println("liga");
        }
        
        if (barcelona.containsValue("Banguera")) {
            System.out.println("Banguera pertenece a barcelona");
        }
    }
}
