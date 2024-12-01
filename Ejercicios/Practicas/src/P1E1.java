import java.util.Scanner;

public class P1E1 {
    public static void main(String[] args) {

        double dist1, dist2, dist3, mm, cm, m;
        Scanner sc = new Scanner(System.in);

        //Solicitud y lectura de medidas
        System.out.print("Introduce distancia en milímetros: ");
        mm = sc.nextDouble();
        System.out.print("Introduce distancia en centímetros: ");
        cm = sc.nextDouble();
        System.out.print("Introduce distancia en metros: ");
        m = sc.nextDouble();

        //Pasamos las distancias a centímetros
        dist1 = (mm/10);
        dist2 = cm;
        dist3 = (m*100);

        System.out.println("La suma de las tres medidas es: "+ (dist1+dist2+dist3) + " centímetros.");
    }
}
