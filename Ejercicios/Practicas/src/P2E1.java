import java.util.Scanner;

public class P2E1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double descuento, total, panBlando, panFresco = 3.49;
        int panVendido;

        System.out.print("Barras del dia anterior vendidas: ");
        panVendido = sc.nextInt();

        /*Calculamos el descuento, el precio de las barras con descuento
        y el total a pagar segun las barras compradas.*/

        descuento = (3.49*0.60);
        panBlando = (3.49-descuento);
        total = (panVendido*panBlando);

        System.out.printf("Precio pan fresco: "+panFresco+"€\nDescuento por cada barra: %1.2f €\n" +
                "Total a pagar: %2.2f €",descuento,total);
    }
}
