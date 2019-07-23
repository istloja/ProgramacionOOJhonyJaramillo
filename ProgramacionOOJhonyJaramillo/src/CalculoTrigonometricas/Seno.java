package CalculoTrigonometricas;

import java.util.Scanner;

public class Seno {

    public static double valor, grados;

    public static void Valor() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor");
        double grados = entrada.nextDouble();
        valor = Math.toRadians(grados);
    }

    private static void calcularSeno() {
        Valor();
        double seno = Math.sin(valor);
        System.out.println("El seno es: " + seno);
    }

    private static void calcularCoseno() {
        Valor();
        double coseno = Math.cos(valor);
        System.out.println("El coseno es: " + coseno);
    }

    private static void calcularTangente() {
        Valor();
        double tangente = Math.tan(valor);
        System.out.println("La tangente es: " + tangente);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige la funcion trigonometrica: ");
        System.out.println("1: Seno");
        System.out.println("2: Coseno");
        System.out.println("3: Tangente");
        int opc = entrada.nextInt();
        switch (opc) {
            case 1:
                calcularSeno();
                break;
            case 2:
                calcularCoseno();
                break;
            case 3:
                calcularTangente();
                break;
        }
    }
}
