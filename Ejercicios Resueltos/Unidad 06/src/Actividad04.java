public class Actividad04 {
    public static void main(String[] args) {

        Actividad04 programa = new Actividad04();
        programa.inicio();
    }

    private void inicio() {

        int[] numero=getArray(20);
        int[] cuadrado=getArray(20);
        int[] cubo=getArray(20);

        rellenarArray(numero);
        calcularCuadrado(numero, cuadrado);
        calcularCubo(numero, cubo);

        imprimirInterfaz();
        imprimirResultado(numero, cuadrado, cubo);
    }

    private void imprimirInterfaz() {
        System.out.println("Número\tCuadrado\tCubo");
        System.out.println("----------------------------");
    }

    private void imprimirResultado(int[] numero, int[] cuadrado, int[] cubo) {
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]+" \t\t "+cuadrado[i]+" \t\t "+cubo[i]);
        }
    }


    private void calcularCubo(int[] numero, int[] cubo) {
        for (int i = 0; i < numero.length; i++) {
            cubo[i]=numero[i]*numero[i]*numero[i];
        }
    }

    private void calcularCuadrado(int[] numero, int[] cuadrado) {
        for (int i = 0; i < numero.length; i++) {
            cuadrado[i]=numero[i]*numero[i];
        }
    }

    private void rellenarArray(int[] numero) {
        for(int i=0; i<numero.length; i++) {
            numero[i]=getAleatorio();
        }
    }

    private int getAleatorio() {
        return (int)(Math.random()*100);
    }

    private int[] getArray(int i) {
        return new int[i];
    }

}
