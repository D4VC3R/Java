package ejercicios.ej12.misclases;
import java.io.*;

public class MyObjectOutputStream extends ObjectOutputStream {

    int modo;
    public final static int INICIO = 0;
    public final static int INSERTAR = 1;

    public MyObjectOutputStream(String rutaArchivo, int modo) throws IOException {
        super(new FileOutputStream(rutaArchivo));
        this.modo = modo;

    }

    //No me copié a la nube el ejercicio que hicimos en clase y no recuerdo bien como se hacía este paso.
    @Override
    protected void writeStreamHeader() throws IOException {
        if (modo == INICIO) {
            super.writeStreamHeader();
        }

    }
}