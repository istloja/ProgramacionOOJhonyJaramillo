package Tarea;

public class Empleados {

    private String nombre;
    private int edad;
    private double Salario;
    static int Plus = 300;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public static int getPlus() {
        return Plus;
    }

    public static void setPlus(int Plus) {
        Empleados.Plus = Plus;
    }

}
