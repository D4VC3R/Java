/* Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de
la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de
suspensos, el número de suficientes, el número de bienes, etc */
public class Aleatorio11 {
    public static void main(String[] args) {

        int i, nota, contSus=0, contSuf=0, contBien=0, contNot=0, contSob=0;
        String notaFinal = "";

        for(i=1;i<=20;i++){
            nota = (int)(Math.random()*(10));
            switch (nota){
                case 0,1,2,3,4:
                    notaFinal = "Suspenso";
                    contSus++;
                    break;
                case 5:
                    notaFinal = "Suficiente";
                    contSuf++;
                    break;
                case 6:
                    notaFinal = "Bien";
                    contBien++;
                    break;
                case 7,8:
                    notaFinal = "Notable";
                    contNot++;
                    break;
                case 9,10:
                    notaFinal = "Sobresaliente";
                    contSob++;
                    break;
            }
            System.out.println("Nota "+i+": "+notaFinal);
        }
        System.out.println("Suspensos: "+contSus +"\nSuficientes: "+contSuf + "\nBien: "+contBien+
                "\nNotables: "+contNot+"\nSobresalientes: "+contSob);
    }
}
