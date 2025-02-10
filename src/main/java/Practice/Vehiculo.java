package Practice;

public class Vehiculo {
    //Atributos
    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    //Constructor
    public Vehiculo(String marca, String modelo, int ano, double precio ) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    //Metodos
    public void calcularImpuesto() {
        double impuesto = precio * 0.03;
        System.out.println("Impuesto Anual " + impuesto);
    }

    @Override
    public String toString() {
        return "Vehiculo [Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio + ", Precio: $" + precio + "]";
    }

    //Getters y Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
