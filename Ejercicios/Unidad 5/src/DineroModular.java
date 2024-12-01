import java.util.Scanner;
public class DineroModular {
    public static void main(String[] args) {
        DineroModular programa = new DineroModular();
        programa.inicio();

    }

    //Modulo principal
    private void inicio() {
        double euros;

        euros = getEuros();
        imprimirPantalla(getBilletes(euros));
        imprimirPantalla(getMonedas(euros));
    }
    //Modulo para calcular las monedas de centimo
    private String getMonedas(double euros) {
        String resultado = "";
        int parteDecimal;

        parteDecimal = getParteDecimal(euros);
        if (parteDecimal >= 50){
            resultado += parteDecimal/50 + " moneda de 50c.\n";
            parteDecimal = parteDecimal%50;
    }
        if(parteDecimal>=20){
            resultado += parteDecimal/20 + " monedas de 20c.\n";
            parteDecimal = parteDecimal%20;
        }
        if(parteDecimal>=10){
            resultado += parteDecimal/10 + " monedas de 10c.\n";
            parteDecimal = parteDecimal%10;
        }
        if(parteDecimal>=5){
            resultado += parteDecimal/5 + " monedas de 5c.\n";
            parteDecimal = parteDecimal%5;
        }
        if(parteDecimal>=2){
            resultado += parteDecimal/2 + " monedas de 2c.\n";
            parteDecimal = parteDecimal%2;
        }if (parteDecimal==1)
            resultado += parteDecimal + " monedas de 1c.\n";
        return resultado;
}

    //Pasar parte decimal(monedas) a entero.
    private int getParteDecimal(double euros) {

        return (int)((euros - getParteEntera(euros))*100);
    }


    //Modulo para obtener billetes
    private String getBilletes(double euros) {
        int billetes;
        String resultado ="";

        billetes = getParteEntera(euros);
        if (billetes >=100){
            resultado += (billetes/100)+" billetes de 100.\n";
            billetes = (billetes%100);
        }
        if (billetes >=50){
            resultado += (billetes/50)+" billetes de 50.\n";
            billetes = (billetes%50);
        }
        if (billetes >=20){
            resultado += (billetes/20)+" billetes de 20.\n";
            billetes = (billetes%20);
        }
        if (billetes >=10){
            resultado += (billetes/10)+" billetes de 10.\n";
            billetes = (billetes%10);
        }
        if (billetes >=5){
            resultado += (billetes/5)+" billetes de 5.\n";
            billetes = (billetes%5);
        }
        if (billetes>=2){
            resultado += (billetes/2)+" monedas de 2€\n";
            billetes = (billetes%2);
        }
        if (billetes==1)
            resultado += billetes+" monedas de 1€\n";
        return resultado;
    }


    //Obtener la parte entera
    private int getParteEntera(double euros) {
        return (int)euros;
    }


    //Modulo para imprimir por pantalla
    private void imprimirPantalla(String s){
        System.out.print(s);
    }

    //Modulo para comprobar que el número es positivo
    private boolean isPositivo(double euros){
        if(euros>0)
            return true;
        else
            return false;
    }

    //Modulo para solicitar euros
    private double getEuros() {
        Scanner sc = new Scanner(System.in);
        double euros;

        do {
            imprimirPantalla("Euros: ");
            euros = sc.nextDouble();
        }while(euros<=0);

        return euros;
    }
}

