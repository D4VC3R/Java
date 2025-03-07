package pruebas;
import banco.CuentaCorriente;

public class PruebaCuenta {
    public static void main(String[] args) {

        CuentaCorriente miCuenta = new CuentaCorriente("David", "7652726F");
        CuentaCorriente suCuenta = new CuentaCorriente("Pancho", "6456465G");



        miCuenta.mostrarInfo();
        System.out.println("\n------------");
        CuentaCorriente.setBanco("BBVA");
        suCuenta.mostrarInfo();

    }
}
