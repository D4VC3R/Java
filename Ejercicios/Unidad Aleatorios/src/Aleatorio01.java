/* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
total (los puntos que suman entre los tres dados) */
public class Aleatorio01 {
    public static void main(String[] args) {

        int dado1, dado2, dado3;

        dado1 = (int)(Math.random()*(6-1+1)+1);
        dado2 = (int)(Math.random()*(6-1+1)+1);
        dado3 = (int)(Math.random()*(6-1+1)+1);

        System.out.println("Dado 1: "+dado1+"\nDado 2: "+dado2+"\nDado 3: "+dado3+ "\nTotal: "+(dado1+dado2+dado3));
    }
}
