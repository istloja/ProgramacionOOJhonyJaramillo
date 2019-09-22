
package Archivo_Serializable;

import java.io.Serializable;


public class Mascota implements Serializable{
    private String Nombre;
    private int NumeroDePatas;

    public Mascota(String Nombre, int NumeroDePatas) {
        this.Nombre = Nombre;
        this.NumeroDePatas = NumeroDePatas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumeroDePatas() {
        return NumeroDePatas;
    }

    public void setNumeroDePatas(int NumeroDePatas) {
        this.NumeroDePatas = NumeroDePatas;
    }
    
}
