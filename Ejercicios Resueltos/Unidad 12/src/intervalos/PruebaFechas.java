package intervalos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;

public class PruebaFechas {
    public static void main(String[] args) {


        LocalDate f1 = LocalDate.now();
        String f2 ,f4="";
        f2= String.valueOf(f1);
        String[] f3 = f2.split("-");
        System.out.println(Arrays.toString(f3));
        for (int i = f3.length; i > 0; i--) {
            if (i!=1)
                f4 += f3[i-1]+"/";
            else
                f4 += f3[i-1];
        }
        System.out.println(f4);


        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd-MM-yy");
        LocalDate fecha1 = LocalDate.of(2016,12,12);
        String cadenaFecha = fecha1.format(formato1);

        //Obtener el mes de la fecha en español
        String mes = fecha1.getMonth().getDisplayName(TextStyle.FULL_STANDALONE, Locale.of("es","ES"));
        String diaSemana = fecha1.getDayOfWeek().getDisplayName(TextStyle.FULL_STANDALONE, Locale.of("es","ES"));
        int dia = fecha1.getDayOfMonth();
        String anyo = String.valueOf(fecha1.getYear());


        System.out.println(diaSemana+", "+dia+" de "+mes+" de "+anyo);


    }
}
