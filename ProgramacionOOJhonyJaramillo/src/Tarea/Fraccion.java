package Tarea;

import java.util.Scanner;

public class Fraccion {

    int num;
    int den;

    public Fraccion() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
    public void Presentar(){
        System.out.println("La fraccion es: "+num+"/"+den);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Fraccion fraccion = new Fraccion();
        System.out.println("Ingrese un numero");
        fraccion.setNum(entrada.nextInt());
        System.out.println("Ingrese el denominador");
        fraccion.setDen(entrada.nextInt());
        fraccion.Presentar();
    }
}
