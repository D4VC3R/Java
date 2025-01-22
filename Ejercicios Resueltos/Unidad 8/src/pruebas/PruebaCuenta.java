package pruebas;
import banco.CuentaCorriente;

public class PruebaCuenta {
    public static void main(String[] args) {

        CuentaCorriente miCuenta = new CuentaCorriente("David", "7652726F");

        if (miCuenta.sacarDinero(49))
            miCuenta.mostrarInfo();


    }
}
