package Conversor;

import java.util.Scanner;

public class Ejecutar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los numeros por teclado de acuerdo a la opcion: ");
        System.out.println("1. De pulgada a centimetros: ");
        System.out.println("2. De metros a decimetro: ");
        System.out.println("3. De millas a kilometros: ");
        System.out.println("4. De centimetros a milimetros: ");
        System.out.println("5. De metros a yarda: ");
        int opc = entrada.nextInt();
        switch (opc) {
            case 1:
                Centimetros centimetros = new Centimetros();
                System.out.println("Ingrese la cantidad en centimetros");
                double cant = entrada.nextDouble();
                System.out.println(centimetros.pulgada_cm(cant));
                break;
            case 2:
                Decimetros decimetro = new Decimetros();
                System.out.println("Ingrese la cantidad en metros");
                double cant1 = entrada.nextDouble();
                System.out.println(decimetro.metros_deci(cant1));
                break;
            case 3:
                Kilometros kilometro = new Kilometros();
                System.out.println("Ingrese la cantidad en millas");
                double cant2 = entrada.nextDouble();
                System.out.println(kilometro.millas_Km(cant2));
                 break;
                  case 4:
                Milimetros milimetro = new Milimetros();
                System.out.println("Ingrese la cantidad en milimetros");
                double cant3=entrada.nextDouble();
                 System.out.println(milimetro.centimetros_mm(cant3));
                 break;
                  case 5:
               Yardas yarda= new Yardas();
                System.out.println("Ingrese la cantidad en metros");
                double cant4=entrada.nextDouble();
                 System.out.println(yarda.metros_Y(cant4));
                 break;

        }
    }
}
