/* Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
termine de generar números hasta que no saque un 24. El programa deberá decir al final
cuántos números se han generado. */
public class Aleatorio9 {
    public static void main(String[] args) {

        int cont=0, num;


        do {
            num = (int) (Math.random() * 100);
            if (num%2==0) {
                cont++;
                System.out.print(num+" ");
            }

        }while (num!=24);
        System.out.println("\nSe han generado "+cont+" números.");
    }
}
