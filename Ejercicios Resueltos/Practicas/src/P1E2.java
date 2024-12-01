import java.util.Scanner;

public class P1E2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double  alturaP, metros;
        int pies, pulg;

        System.out.print("Pies: ");
        pies = sc.nextInt();
        System.out.print("Pulgadas: ");
        pulg = sc.nextInt();

        //Agrupamos las medidas en pulgadas
        alturaP = (pies*12) + pulg;

        //Pasamos de pulgadas a sistema métrico
        metros = (alturaP*2.54)/100;

        //Visualización en metros
        System.out.printf(pies + "'" + " " + pulg + "''" + " son %.2f metros.", metros);




    }
}
