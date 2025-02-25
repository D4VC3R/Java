package ejercicios.ej02.hora2;

import ejercicios.ej02.enumerados.Franja;
import ejercicios.ej02.excepciones.FranjaInvalidaException;

public class Hora2{

    //Atributos
    private int hora, minuto;
    private Franja franja;

    //Constructor
    public Hora2(int hora, int minuto, String franja) {
        setHora(hora);
        setMinuto(minuto);
        setFranja(franja);
    }

    //Metodos
    public void setFranja(String franja) {
        try{
            if (franja.equalsIgnoreCase("am")){
                this.franja = Franja.AM;
            }else
                if (franja.equalsIgnoreCase("pm")){
                    this.franja = Franja.PM;
                }else
                    throw new FranjaInvalidaException();
        } catch (FranjaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setHora(int hora) {
        if (hora >=1 && hora<=12){
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >=0 && minuto<=59){
            this.minuto = minuto;
        }
    }
    public void inc(){
        if (hora == 12 && minuto == 59 && franja == Franja.AM){
            setHora(1);
            setMinuto(0);
            setFranja("pm");
        }else if(hora == 12 && minuto == 59 && franja == Franja.PM){
            setHora(1);
            setMinuto(0);
            setFranja("am");
        }else if (minuto == 59){
            setHora(this.hora+1);
            setMinuto(0);
        }else
            minuto++;
    }
    @Override
    public String toString() {
        String r = "";
        if (hora>=0 && hora <=9)
            r += "0"+hora+":";
        else
            r += hora + ":";
        if (minuto>=0 && minuto<=9)
            r += "0"+minuto+" "+franja.name();
        else
            r += minuto+" "+franja.name();
        return r;
    }
}