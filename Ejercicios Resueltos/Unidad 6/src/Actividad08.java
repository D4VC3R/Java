/*Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.*/
import java.util.Scanner;
public class Actividad08 {
    public static void main(String[] args) {

        Actividad08 programa = new Actividad08();
        programa.inicio();
    }

    private void inicio() {

        double[] temperatura = getArray(12);
        String[] meses = getMeses();

        rellenarTemp(temperatura, meses);
        getDiagrama(temperatura, meses);

    }

    private void getDiagrama(double[] temperatura, String[] meses) {

        for(int i=0;i< temperatura.length;i++){
            //Asteriscos
            for (int j=0;j<(int)temperatura[i];j++){
                System.out.print("*");
            }
            System.out.println(" --> "+temperatura[i]+" grados.");
        }
    }

    private void rellenarTemp(double[] temperatura, String[] meses) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce temperatura media");
        for (int i=0;i< temperatura.length;i++){
            System.out.print(meses[i]+": ");
            temperatura[i]=sc.nextDouble();
        }
    }

    private String[] getMeses() {
        return new String[]{"Enero", "Febrero", "Marzo", "Abril",
                "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    }

    private double[] getArray(int i) {
        return new double[i];
    }
}