package Practice;

public class Automovil extends Vehiculo{
    int numeroPuertas;

    public Automovil(String marca, String modelo, int ano, double precio, int numeroPuertas) {
        super(marca, modelo, ano, precio);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void calcularImpuesto() {
        double impuesto = getPrecio() * 0.05;
        System.out.println("Impuesto Anual para Automóvil: $" + impuesto);
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de puertas: " + numeroPuertas;
    }
}
