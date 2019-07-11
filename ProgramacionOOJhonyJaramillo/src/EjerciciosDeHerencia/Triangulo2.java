package EjerciciosDeHerencia;

class Triangulo2 extends DosDimensiones2 {

    String estilo;

    double area() {
        return base * altura / 2; //Error! no se puede acceder
    }

    void mostrarEstilo() {
        System.out.println("Triangulo es: " + estilo);
    }
}
