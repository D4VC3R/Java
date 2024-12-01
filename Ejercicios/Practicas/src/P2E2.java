import java.util.Scanner;

public class P2E2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double gradosC, gradosF;

        System.out.print("Temperatura en grados centígrados: ");
        gradosC = sc.nextDouble();

        //Conversion a Fahrenheit
        gradosF = gradosC*1.8+32;

        System.out.printf(gradosC+"ºC son %.2fºF",gradosF);

    }

}

