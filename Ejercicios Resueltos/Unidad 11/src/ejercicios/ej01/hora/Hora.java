package ejercicios.ej01.hora;

public class Hora {

    //Atributos
    protected int hora, minuto;

    //Constructor
    public Hora(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }

    //Metodos
    public void setHora(int hora) {
        if (hora >=0 && hora<=23){
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >=0 && minuto<=59){
            this.minuto = minuto;
        }
    }
     public void inc(){
        if (hora == 23 && minuto == 59){
            setHora(0);
            setMinuto(0);
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
            r += "0"+minuto;
        else
            r += minuto;
        return r;
    }
}
