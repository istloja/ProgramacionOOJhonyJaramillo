
package Tarea;


public class Producto {
    private String nombre ;
    private double precio;
    private int cantidad;
    private double total;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Producto() {
    }

    public Producto(String nombre, double precio, int cantidad,double total) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = total;
    }

    
   
    public double calcularP (double precio, int cantidad){
    total = precio*cantidad;
    return total;    
    }

}

