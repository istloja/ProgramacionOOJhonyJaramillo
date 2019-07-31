package Tarea;



public class Repartidor extends Empleados {
    private int Zona;

    public int getZona() {
        return Zona;
    }

    public void setZona(int Zona) {
        this.Zona = Zona;
    }

    public static int getPlus() {
        return Plus;
    }

    public static void setPlus(int Plus) {
        Empleados.Plus = Plus;
    }
 
public boolean plusR (int edad,int Zona){
  
    if (edad < 25 && Zona == 3)  {
    return true;
    
    }
    
    else {
    return false;
    }
    

} 
 
 
}