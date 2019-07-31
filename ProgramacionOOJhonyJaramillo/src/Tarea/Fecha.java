package Tarea;

import java.util.Scanner;

public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean fechaCorrecta() {       
        if ((dia >30)&& (mes>12) && (año >2019)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean esBisiesto() {
        if (año / 4 == 0 && año / 100 != 0 && año / 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean diaSiguiente() {
        boolean fechaActual = true;
        if (dia == 5) {
            dia = dia + 1;
            return fechaActual;
        } else {
            return false;
        }
        
    }
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Fecha fecha = new Fecha();
        System.out.println("Ingrese una fecha");
        fecha.setMes(entrada.nextInt());
        System.out.println("Ingrese el año");
        fecha.setAño(entrada.nextInt());
        System.out.println("El dia es");
        fecha.setDia(entrada.nextInt());
        fecha.fechaCorrecta();
        fecha.esBisiesto();
        fecha.diaSiguiente();
        
    }
    
}
