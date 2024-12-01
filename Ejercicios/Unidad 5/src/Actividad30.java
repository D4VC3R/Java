/*Haz un programa que lea el peso de los diferentes alumnos de una clase. Los
pesos se irán leyendo hasta que se introduzca un número negativo. A
continuación, se visualizará por pantalla la cantidad de alumnos que hay dentro
de los siguientes rangos: menor de 50 Kg, entre 50 y 65 Kg, entre 66 y 80, y
mayores de 80 Kg. Además, también queremos que se visualice el tanto por
ciento que representa cada cantidad de alumnos respecto al total de alumnos
así como el peso mediano de toda la clase.*/
import java.util.Scanner;
public class Actividad30 {
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
