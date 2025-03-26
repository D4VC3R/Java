package intervalos;

public class PruebaTiempo {
    public static void main(String[] args) {

        long principio = System.nanoTime();
        for(int i=0; i<100;i++){
            System.out.println((int)(Math.random()*10));
        }
        double fin = System.nanoTime();
        System.out.println("Tiempo: "+(fin-principio)+" nanosegundos");
        System.out.println("Tiempo: "+(fin-principio)/1000+" microsegundos");
        System.out.println("Tiempo: "+(fin-principio)/1000000+" milisegundos");
        System.out.println("Tiempo: "+(fin-principio)/1000000000+" segundos");
    }
}
