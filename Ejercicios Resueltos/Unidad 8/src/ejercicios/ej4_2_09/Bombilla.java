package ejercicios.ej4_2_09;

public class Bombilla {


    //Atributos
    private boolean encendida;
    private static boolean interruptorGeneral = true;

    //Constructor
    public Bombilla() {
        this.encendida = false;
    }

    //Setter

    private void setEncendida() {
        this.encendida = true;
    }

    //Getter
    public static boolean isInterruptorGeneral() {
        return interruptorGeneral;
    }

    //Metodos
    public void encender() {
        if (!interruptorGeneral) {
            setEncendida();
        } else {
            setEncendida();
            System.out.println("Has encendido la bombilla.");
        }
    }

    public void apagar() {
        if (!this.encendida) {
            System.out.println("Esta bombilla ya estaba apagada.");
        }else {
            this.encendida = false;
            System.out.println("Has apagado la bombilla.");
        }
    }

    public boolean isEncendida() {
        return encendida && interruptorGeneral;
    }

    public static void cortarLuz() {
        interruptorGeneral = false;
        System.out.println("Has cortado la luz en toda la casa.");
    }

    public static void restaurarLuz() {
        interruptorGeneral = true;
        System.out.println("Fusible general encendido.");
    }
    public String estadoBombilla(){
        if (isEncendida())
            return "Encendida.";
        return "Apagada.";
    }
}