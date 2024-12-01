import java.util.Scanner;

public class Pesos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int peso, menos50=0, entre50y65=0, entre66y80=0, mas80=0, totalAlu=0;

        do {
            System.out.println("Ingrese el valor del peso: ");
            peso = sc.nextInt();
            if (peso < 50)
                menos50++;
            if (peso >= 50 && peso<=65)
                entre50y65++;
            if (peso >=66 && peso<=80)
                entre66y80++;
            if (peso > 80)
                mas80++;
            totalAlu++;
        }while (peso > 0);

        System.out.println("Rangos de pesos:\nMenos de 50: "+menos50+"\nEntre 50 y 65: "+entre50y65+"\nEntre 66 y 80: "+entre66y80
        +"\nMas de 80: "+mas80+"\nTotal: "+totalAlu);
    }
}
