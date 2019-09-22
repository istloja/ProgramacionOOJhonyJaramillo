
package Archivo_Serializable;

import java.io.Serializable;


public class Persona implements Serializable{
    private String Nombre;
    private String Apellido;
    private int Edad;
    private Mascota mascota;

    public Persona(String Nombre, String Apellido, int Edad, Mascota mascota) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.mascota = mascota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    public static void main(String[] args) {
        Persona persona=new Persona("Jhony","Jaramillo",28, new Mascota("tigre", 4));
        Persona persona2= new Persona("Juan","Soto",25, new Mascota("Lasy", 4));
        System.out.println(" La mascota de: " + persona.getNombre() +" Se llama: "+ persona.getMascota().getNombre());
    }
}
