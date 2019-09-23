package Vehiculos;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Marcas {

    List<Vehiculo> vehiculos = new LinkedList<Vehiculo>();

    public void crearVehiculos() {
        vehiculos.add(new Vehiculo("Kia", "Nuevo", "Blanco", 30.000, "ABT-121", "Gasolina", "Rio", 2018, 1396));
        vehiculos.add(new Vehiculo("Audi", "Nuevo", "Negro", 19.000, "LBO-328", "Gasolina", "A3", 2017, 150));
        vehiculos.add(new Vehiculo("BAIC", "Nuevo", "Rojo", 18.990, "AAB-122", "Gasolina", "D20", 2018, 110));
        vehiculos.add(new Vehiculo("BMW", "Nuevo", "Blanco", 20.000, "BBB-123", "Gasolina", "Kia Rio", 2015, 150));
        vehiculos.add(new Vehiculo("Chery", "Nuevo", "Verde", 14.000, "LLG-123", "Gasolina", "Kia Rio", 2015, 150));
        vehiculos.add(new Vehiculo("Chevrolet", "Azul", "Blanco", 33.000, "ABB-523", "Gasolina", "Kia Rio", 2015, 150));
        vehiculos.add(new Vehiculo("Honda", "Nuevo", "Amarillo", 17.000, "DFT-423", "Gasolina", "Kia Rio", 2015, 150));
        vehiculos.add(new Vehiculo("Hyundai", "Nuevo", "Platiado", 25.000, "AGR-123", "Gasolina", "Kia Rio", 2015, 150));
        vehiculos.add(new Vehiculo("MercedesBenz", "Plomo", "Blanco", 35.000, "ABY-593", "Gasolina", "Kia Rio", 2015, 150));
        vehiculos.add(new Vehiculo("Nissan", "Nuevo", "Gris", 22.000, "ABU-123", "Gasolina", "Kia Rio", 2015, 150));
        vehiculos.add( new Vehiculo("Toyota", "Nuevo", "DobleColor", 50.000, "AKB-155", "Gasolina", "Kia Rio", 2015, 150));
    }
    
    public Vehiculo getMejorPrecio(){
        Vehiculo mejorPrecio = null;
        for (Vehiculo vehiculo : vehiculos) {
            if (mejorPrecio == null) {
                mejorPrecio = vehiculo;
            } else {
                if (mejorPrecio.getPrecio() > vehiculo.getPrecio())
                    mejorPrecio = vehiculo;
            }
        }
        return mejorPrecio;
    }  
    
    public static void main(String[] args) {
        Marcas marcas = new Marcas();
        marcas.crearVehiculos();
        System.out.println("Por precio el mejor es: " + marcas.getMejorPrecio());
    }
}
