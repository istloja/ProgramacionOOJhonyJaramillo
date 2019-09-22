
package Equipos;

import java.util.HashMap;
import java.util.Scanner;


public class Notas {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("C123","Loja");
        mapa.put("C456", "Zamora");
        mapa.put("C456", "Quito");
        mapa.put("C456", "Machala");
        mapa.put("C456", "Cuenca");
       Scanner entrada = new Scanner(System.in);
       String Ciudad = "";
       String Codigo = "";
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el codigo"+ Codigo);
            Codigo = entrada.next();
            System.out.println("Ingrese la ciudad"+ Ciudad);
            Ciudad = entrada.next();
            
        }
        System.out.println(mapa);
    }
    
    
}
