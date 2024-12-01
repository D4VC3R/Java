public class NumerosAleatorios {
    public static void main(String[] args) {

        int dado1, dado2, dado3;

        dado1 = (int)(Math.random()*(24-20+1)+20);
        System.out.println("Tirada 1: "+dado1);
        dado2 = (int)(Math.random()*(24-20+1)+20);
        System.out.println("Tirada 2: "+dado2);
        dado3 = (int)(Math.random()*(24-20+1)+20);
        System.out.println("Tirada 3: "+dado3);

        System.out.println("Total: "+(dado1+dado2+dado3));
    }
}
