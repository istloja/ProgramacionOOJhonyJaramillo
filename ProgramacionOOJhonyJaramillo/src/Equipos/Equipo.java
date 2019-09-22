package Equipos;

import java.util.HashMap;

public class Equipo {

    private String nombre;
    private int numeroTitulos;
    private String ciudad;
    private String años;

    public Equipo(String nombre, int numeroTitulos, String ciudad) {
        this.nombre = nombre;
        this.numeroTitulos = numeroTitulos;
        this.ciudad = ciudad;
        this.años = años;
    }

    public Equipo() {
    }

    public Equipo(String liga_de_Quito, String blancol, int i, String antonio_Valencia, Futbolista futbolista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTitulos() {
        return numeroTitulos;
    }

    public void setNumeroTitulos(int numeroTitulos) {
        this.numeroTitulos = numeroTitulos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAños() {
        return años;
    }

    public void setAños(String años) {
        this.años = años;
    }

    public Object getFutbolista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}
