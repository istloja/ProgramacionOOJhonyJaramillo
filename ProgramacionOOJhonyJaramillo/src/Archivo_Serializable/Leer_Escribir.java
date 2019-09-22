package Archivo_Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Leer_Escribir {

    public void escribirArchivo(String rutaArchivo, Persona persona) {
        try {
            ObjectOutputStream ejemplo = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
            ejemplo.writeObject(persona);
            ejemplo.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }

    public void leerArchivos(String rutaArchivo) {
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(rutaArchivo));
            Object auxiliar = leer.readObject();
            while (auxiliar != null) {
                Persona persona = (Persona) auxiliar;
                System.out.println(persona.getMascota().getNombre());
                auxiliar = leer.readObject();
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public void escribirLista(String direccionArchivo, List<Persona> listaPersona) {
        try {
            ObjectOutputStream leer = new ObjectOutputStream(new FileOutputStream(direccionArchivo));
            for (Persona persona : listaPersona) {
                leer.writeObject(persona);
            }
        } catch (Exception e) {
        }

    }

    public List<Persona> lista(String direccion) {
        List<Persona> lista = new ArrayList<Persona>();
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = leer.readObject();
            
            while (auxiliar != null) {
                Persona persona = (Persona) auxiliar;
                lista.add(persona);
                auxiliar = leer.readObject();
            }
        } catch (Exception e) {

        }
        return lista;
    }

    public static void main(String[] args) {
        Leer_Escribir obj = new Leer_Escribir();
        Persona persona = new Persona("Jhony", "Jaramillo", 28, new Mascota("tigre", 4));
        // obj.escribirArchivo("C:\\Users\\Usuario\\Desktop\\Ejemplo(2).txt", persona);
        // obj.leerArchivos("C:\\Users\\Usuario\\Desktop\\Ejemplo.txt");
        Persona persona2 = new Persona("Pablo", "Abrigo", 20, new Mascota("Oddy", 4));
        Persona persona3 = new Persona("Franklin", "Jaramillo", 33, new Mascota("tiburon", 4));
        Persona persona4 = new Persona("Jorge", "Jaramillo", 30, new Mascota("Lazy", 4));
        List<Persona> lista = new ArrayList<>();
        lista.add(persona);
        lista.add(persona2);
        lista.add(persona3);
        lista.add(persona4);
        obj.escribirLista("C:\\Users\\Usuario\\Desktop\\Ejemplo(2).txt", lista);
        obj.leerArchivos("C:\\Users\\Usuario\\Desktop\\Ejemplo(2).txt");
        List<Persona> lista1 = obj.lista("C:\\Users\\Usuario\\Desktop\\Ejemplo(2).txt");
        for (Persona person : lista1) {
            System.out.println(persona.getNombre());
        }
    }
}
