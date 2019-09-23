package Vehiculos;


public class Vehiculo {

    String marca;
    String estado;
    String color;
    double precio;
    String placa;
    String tipoMotor;
    String modelo;
    int anio;
    int cilindrada;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String estado, String color, double precio, 
            String placa, String tipoMotor, String modelo, int anio, int cilindrada) {
        this.marca = marca;
        this.estado = estado;
        this.color = color;
        this.precio = precio;
        this.placa = placa;
        this.tipoMotor = tipoMotor;
        this.modelo = modelo;
        this.anio = anio;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCapacidad() {
        return tipoMotor;
    }

    public void setCapacidad(String capacidad) {
        this.tipoMotor = tipoMotor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMotor() {
        return cilindrada;
    }

    public void setMotor(int motor) {
        this.cilindrada = motor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", estado=" + estado + ", color=" + color + ", precio=" + precio + ", placa=" + placa + ", tipoMotor=" + tipoMotor + ", modelo=" + modelo + ", anio=" + anio + ", cilindrada=" + cilindrada + '}';
    }

    
}

