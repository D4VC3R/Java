package ejercicios.ej03.horaExacta;

import ejercicios.ej01.hora.Hora;

public class HoraExacta extends Hora {

    //Atributos
    protected int segundos;

    //Constructor
    public HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
        setSegundos(segundos);
    }

    //Metodos
    public void setSegundos(int segundos) {
        if (segundos >=0 && segundos <= 59)
            this.segundos = segundos;
    }

    @Override
    public void inc() {
        if (hora == 23 && minuto == 59 && segundos == 59){
            setHora(0);
            setMinuto(0);
            setSegundos(0);
        }else if (minuto == 59 && segundos == 59){
            setHora(this.hora+1);
            setMinuto(0);
            setSegundos(0);
        }else if (segundos == 59){
            setMinuto(this.minuto+1);
            setSegundos(0);
        }else
            segundos++;
    }

    @Override
    public String toString() {
        String r=super.toString();
        if (segundos>=0 && segundos<=9)
            r+=":0"+segundos;
        else
            r+=":"+segundos;
        return r;
    }

    @Override
    public boolean equals(Object o) {
        HoraExacta otraHora = (HoraExacta)o;
        return (this.hora == otraHora.hora) && (this.minuto == otraHora.minuto) && (this.segundos == otraHora.segundos);
    }
}
