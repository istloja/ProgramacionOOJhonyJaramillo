
package Fecha;

import java.util.Date;


public class TrabajoFechas {
    public static void main(String[] args) {
       Date fecha=new Date(101,6,18);
       Date fechaActual=new Date();
        System.out.println(fecha.after(fechaActual));
         System.out.println(fecha.before(fechaActual));
    }
}
