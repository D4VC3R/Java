/*Realizar un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor
o igual a 28 y siempre múltiplo de 4 (4, 8, 12,...);
c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás
mediante la barra vertical “|”. El final de la melodía se marca con dos barras.
d) La última nota de la melodía debe coincidir con la primera*/
public class Aleatorio15 {
    public static void main(String[] args) {

        int detNota, i, melodia, compas=4;
        String nota ="";

        do {
            melodia = (int)(Math.random()*(28-4+1)+1);
        }while(melodia%4!=0);


        for (i = 1; i <= compas; i++) {
            detNota = (int) (Math.random() * (7 - 1 + 1) + 1);
            nota = switch (detNota) {
                case 1 -> "DO ";
                case 2 -> "RE ";
                case 3 -> "MI ";
                case 4 -> "FA ";
                case 5 -> "SOL ";
                case 6 -> "LA ";
                case 7 -> "SI ";
                default -> nota;
            };
            System.out.print(nota);
        }
        System.out.print("|");
    }


}

