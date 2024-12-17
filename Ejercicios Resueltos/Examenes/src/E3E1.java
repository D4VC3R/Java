import java.util.Scanner;

public class E3E1 {
    public static void main(String[] args) {

        E3E1 programa = new E3E1();
        programa.inicio();
    }

    private void inicio() {
        int euros, beneficio=0, tirada1, tirada2, tirada3, jugada=1;
        String resultado;
        char continua;

        imprimirInterfaz();
        euros = getEuros();

        do {
            euros--;
            imprimirPantalla("--------------\n  Tirada: "+jugada+"\n--------------\n");
            tirada1 = getTirada();
            tirada2 = getTirada();
            tirada3 = getTirada();

            resultado = comprobarTirada(tirada1, tirada2, tirada3);
            imprimirTirada(tirada1, tirada2, tirada3, resultado);

            if (tiradaGanadora(tirada1, tirada2, tirada3)) {
                beneficio += 10;
                euros++;
            }else if (tiradaPerdedora(tirada1, tirada2, tirada3)) {
                beneficio --;
            }else
                euros++;
            imprimirPantalla("\nDinero en juego: "+euros+"\nBeneficio: "+beneficio+"\n");

            continua = quieresContinuar();
            jugada ++;

        }while(continuar(continua)&&euros>0);
        if(euros==0)
            imprimirPantalla("FIN!!! Lo has perdido todo.");
        else
            imprimirPantalla("Fin!!! Has ganado " +beneficio + " euros.");
    }

    private boolean continuar(char continua) {
        return continua == 's';
    }

    private char quieresContinuar() {
        char continua;
        Scanner sc = new Scanner(System.in);
        do {

            imprimirPantalla("¿Quieres continuar jugando(s/n)?");
            continua = sc.next().charAt(0);
            if (continua != 's' && continua != 'n')
                imprimirPantalla("Error: Debe elegir si (s) o no (n).\n");

        }while(continua !='n' && continua != 's');

        return continua;
    }

    private void imprimirTirada(int tirada1, int tirada2, int tirada3, String resultado) {
        imprimirPantalla(codificarTirada(tirada1)+" "+codificarTirada(tirada2)+" "
                +codificarTirada(tirada3)+"\n"+resultado);
    }

    private String comprobarTirada(int tirada1, int tirada2, int tirada3) {
        String resultado="";
        if (tiradaGanadora(tirada1, tirada2, tirada3))
            resultado = "Enhorabuena, ha ganado 10 monedas.";
        else if (tiradaPerdedora(tirada1, tirada2, tirada3))
            resultado = "Lo siento, ha perdido.";
        else
            resultado = "Ha recuperado su moneda.";
        return resultado;
    }

    private boolean tiradaGanadora(int tirada1, int tirada2, int tirada3) {
        return (tirada1 == tirada2 && tirada1 == tirada3);
    }

    private boolean tiradaPerdedora(int tirada1, int tirada2, int tirada3) {
        return tirada1 != tirada2 && tirada2 != tirada3 && tirada1 != tirada3;
    }


    private String codificarTirada(int tirada) {
        String figura="";

        switch(tirada) {
            case 0: figura = "calabaza";
            break;
            case 1: figura = "diamante";
            break;
            case 2: figura = "elfo";
            break;
            case 3: figura = "uvas";
            break;
            default: figura = "tuerca";
        }
        return figura;

    }

    private int getTirada() {
        return (int)(Math.random()*(5));
    }

    private void imprimirInterfaz() {
        imprimirPantalla("  =====================\n" +
                "|| MAQUINA TRAGAPERRAS ||\n" +
                "  =====================\n");
    }

    private int getEuros() {
        Scanner sc = new Scanner(System.in);
        int euros;

        do {
            imprimirPantalla("Cantidad de euros a jugar = ");
            euros = sc.nextInt();
            if(!isValido(euros))
                imprimirPantalla("La cantidad debe ser superior a 0.\n");
        }while(!isValido(euros));
        return euros;
    }

    private boolean isValido(int euros) {
        return euros> 0;
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }
}
