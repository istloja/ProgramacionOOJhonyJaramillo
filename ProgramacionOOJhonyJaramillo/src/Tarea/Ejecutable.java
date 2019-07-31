package Tarea;


public class Ejecutable {

   public static void main(String[] args) {
        Repartidor objeto = new Repartidor();
        objeto.setNombre("Angel");
        objeto.setEdad(24);
        objeto.setSalario(234.5);
        objeto.setZona(2);
        System.out.println(objeto.plusR(objeto.getEdad(), objeto.getZona()));
        Repartidor objeto2 = new Repartidor();
        objeto2.setNombre("Martha");
        objeto2.setEdad(35);
        objeto2.setSalario(568.34);
        objeto2.setZona(5);
        System.out.println(objeto2.plusR(objeto2.getEdad(), objeto2.getZona()));
        Repartidor objeto3 = new Repartidor();
        objeto3.setNombre("Vinicio");
        objeto3.setEdad(19);
        objeto3.setSalario(402.89);
        objeto3.setZona(3);
        System.out.println(objeto3.plusR(objeto3.getEdad(), objeto3.getZona()));
        Comercial objetos = new Comercial();
        objetos.setNombre("Leonardo");
        objetos.setEdad(54);
        objetos.setComision(212.34);
        objetos.setSalario(341.0);
        System.out.println(objetos.plusC(objetos.getSalario(), objetos.getEdad(), objetos.getComision()));
        Comercial objetos2 = new Comercial();
        objetos2.setNombre("Amelia");
        objetos2.setEdad(34);
        objetos2.setComision(360.34);
        objetos2.setSalario(211.0);
        System.out.println(objetos2.plusC(objetos2.getSalario(), objetos2.getEdad(), objetos2.getComision()));
        Comercial objetos3 = new Comercial();
        objetos3.setNombre("Gloria");
        objetos3.setEdad(25);
        objetos3.setSalario(456.0);
        objetos3.setComision(121.0);
        System.out.println(objetos3.plusC(objetos3.getSalario(), objetos3.getEdad(), objetos3.getComision()));
    }

}
