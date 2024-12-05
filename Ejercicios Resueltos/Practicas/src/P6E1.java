import java.util.Scanner;

public class P6E1 {
    public static void main(String[] args) {

        P6E1 programa = new P6E1();
        programa.inicio();
    }

    private void inicio() {

        int hora, minutos, segundos;
        String resultado;

        hora = getHora();
        minutos = getMinutos();
        segundos = getSegundos();

        impHoraIntroducida(hora, minutos, segundos);

        segundos = segundoSiguiente(segundos);
        minutos = minutoSiguiente(minutos, segundos);
        hora = horaSiguiente(hora, minutos, segundos);

        impHoraSiguiente(hora, minutos, segundos);

    }

    private void impHoraSiguiente(int hora, int minutos, int segundos) {
        imprimirPantalla("\nHora un segon desprès: "+hora+":"+minutos+":"+segundos);
    }


    private int horaSiguiente(int hora, int minutos, int segundos) {
        if(minutos==0 && segundos==0)
            hora +=1;
        if (!horaValida(hora))
            hora=0;
        return hora;
    }

    private int minutoSiguiente(int minutos, int segundos) {
        if (segundos == 0){
            minutos += 1;
            if (!isValido(minutos))
                minutos=0;
        }
        return minutos;
    }

    private int segundoSiguiente(int segundos) {

        segundos+=1;
        if (!isValido(segundos)){
            segundos=0;
        }
        return segundos;
    }

    private void impHoraIntroducida(int hora, int minutos, int segundos) {
        imprimirPantalla("Hora introduïda: "+hora+":"+minutos+":"+segundos);
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private int getSegundos() {
        Scanner sc = new Scanner(System.in);
        int segundos;
        do {
            System.out.print("Segundos: ");
            segundos = sc.nextInt();
        }while(!isValido(segundos));
        return segundos;
    }

    private int getMinutos() {
        Scanner sc = new Scanner(System.in);
        int minutos;
        do {
            System.out.print("Minutos: ");
            minutos = sc.nextInt();
        }while(!isValido(minutos));
        return minutos;
    }

    private boolean isValido(int i) {
        return i>=0 && i<=59;
    }

    private int getHora() {
        Scanner sc = new Scanner(System.in);
        int hora;
        do {
            System.out.print("Hora: ");
            hora = sc.nextInt();
        }while(!horaValida(hora));
        return hora;
    }

    private boolean horaValida(int hora) {
        return hora >=0 && hora<=23;
    }
}
