package Equipos;

import java.util.HashMap;

public class TrabajoClases {
    
    public static void main(String[] args) {
         HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Programacion", 6);
        mapa.put("Ingles", 7);
        mapa.put("Base de datos", 10);
        mapa.put("Algebra", 5);
        System.out.println(mapa.get("Ingles"));
        System.out.println(mapa.get("Algebra") + 1);
        mapa.remove("Ingles");
        System.out.println(mapa);
        HashMap<String, Equipo> mapa1 = new HashMap<>();
        mapa1.put("Emelec", new Equipo("Marlon", 11, "Ecuador"));
        mapa1.put("Barcelona", new Equipo("Alvez", 11, "Ecuador"));
        mapa1.put("Nacional", new Equipo("Vera", 11, "Ecuador"));
        System.out.println(mapa.get("Ecuador"));

    }
    
}
