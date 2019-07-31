package Tarea;

public class Perecible extends Producto {

    private int diasCaducar;

    public int getDiasCaducar() {
        return diasCaducar;
    }

    public void setDiasCaducar(int diasCaducar) {
        this.diasCaducar = diasCaducar;
    }

    @Override
    public String toString() {
        return "Perecible{" + "diasCaducar=" + diasCaducar + '}';
    }

    public double Calcularpe(double precio, double cantidad, int diasCaducar) {
        precio = precio * cantidad;
        if (diasCaducar == 1) {
            precio = precio / 4;
            return precio;
        }
        if (diasCaducar == 2) {
            precio = precio / 3;
            return precio;
        }
        if (diasCaducar == 3) {
            precio = precio / 2;
            return precio;
        }
        return 0;
    }
}
