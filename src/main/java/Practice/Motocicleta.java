package Practice;

public class Motocicleta extends Vehiculo{
    int cilindrada;

    public Motocicleta(String marca, String modelo, int ano, double precio, int cilindrada) {
        super(marca, modelo, ano, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public void calcularImpuesto() {
        double impuesto = getPrecio() * 0.03;
        System.out.println("Impuesto Anual para Moto: $" + impuesto);
    }

    @Override
    public String toString() {
        return super.toString() + ",Cilindrada: " + cilindrada;
    }
}
