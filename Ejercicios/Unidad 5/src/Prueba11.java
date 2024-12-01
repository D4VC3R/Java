import java.util.Scanner;
public class Prueba11 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int mes;

        System.out.print("Número de mes: ");
        mes = sc.nextInt();

        while (mes < 1 || mes > 12) {
            System.out.print("Número de mes inválido, prueba de nuevo: ");
            mes = sc.nextInt();
        }

        if (mes == 1) {
            System.out.println("Enero.");
        } else if (mes == 2) {
            System.out.println("Febrero.");
        } else if (mes == 3) {
            System.out.println("Marzo.");
        } else if (mes == 4) {
            System.out.println("Abril.");
        } else if (mes == 5) {
            System.out.println("Mayo.");
        } else if (mes == 6) {
            System.out.println("Junio.");
        } else if (mes == 7) {
            System.out.println("Julio.");
        } else if (mes == 8) {
            System.out.println("Agosto.");
        } else if (mes == 9) {
            System.out.println("Septiembre.");
        } else if (mes == 10) {
            System.out.println("Octubre.");
        } else if (mes == 11) {
            System.out.println("Noviembre.");
        } else
            System.out.println("Diciembre.");

    }
}