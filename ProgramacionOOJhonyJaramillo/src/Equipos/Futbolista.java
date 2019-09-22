package Equipos;

import java.util.ArrayList;
import java.util.List;

public class Futbolista {

    private String nombre;
    private String apellido;
    private int edad;
    private int numeroGoles;
    private int añoDebut;
    private Equipo equipo;

    public Futbolista(String nombre, String apellido, int edad, int numeroGoles, Equipo equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
        this.añoDebut = añoDebut;
        this.equipo = equipo;
    }

    public Futbolista(String leonel, String messi, int i, String delantero, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public int getAñoDebut() {
        return añoDebut;
    }

    public void setAñoDebut(int añoDebut) {
        this.añoDebut = añoDebut;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;

    }
    public double PorcentajeDeAciertos(Futbolista objeto){
        return (objeto.getNumeroGoles()+objeto.getEdad())/objeto.Rendimiento();
        
    }
    public double Rendimiento(Futbolista objeto){
        return objeto.getAñoDebut()/objeto.getNumeroGoles();
        
    }
    public double VerificarEfectividad(Futbolista objeto){
        return PorcentajeDeAciertos(objeto)+VerificarEfectividad(objeto)+objeto.getEdad();
        
    }
    public Futbolista VerificarMenor(List<Futbolista> lista) {
        Futbolista menor = lista.get(0);
        for (Futbolista futbolista : lista) {
            if (menor.getEdad() > futbolista.getEdad()) {
                menor = futbolista;
            }
        }
        return menor;
    }
    public static void main(String[] args) {
        List<Futbolista> lista = new ArrayList<>();
        lista.add(new Futbolista("Cristiano", "Ronaldo", 34, 600, new Equipo("Juventos", 30, "Turis")));
        lista.add(new Futbolista("Leonel", "Messi", 32, 500, new Equipo("Barcelona", 100, "Barcelona")));
        lista.add(new Futbolista("Neymar", "Junior", 28, 300, new Equipo("Pag", 30, "Paris")));
        lista.add(new Futbolista("Heden", "Hazar", 26, 100, new Equipo("Real Madrid", 200, "MadridS")));
       // Futbolista fut = new Futbolista("Manuel", "Jaramillo", 28, 15, "barce");
        //System.out.println(fut.VerificarMenor(lista));
    }

    private int Rendimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
