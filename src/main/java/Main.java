import Practice.Automovil;
import Practice.Motocicleta;
import Practice.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Automovil automovil= new Automovil("Toyota", "Corolla", 2020, 200000.0, 4);
        System.out.println(automovil);
        automovil.calcularImpuesto();

        Motocicleta motocicleta = new Motocicleta("Yamaha", "R1", 2020, 150000.0, 600);
        System.out.println(motocicleta);
        motocicleta.calcularImpuesto();
    }
}
