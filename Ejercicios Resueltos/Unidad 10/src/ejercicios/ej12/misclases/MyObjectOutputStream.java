package ejercicios.ej12.misclases;

import java.io.*;

public class MyObjectOutputStream extends ObjectOutputStream {
    public MyObjectOutputStream(String rutaArchivo, boolean append) throws IOException {
        super(new FileOutputStream(rutaArchivo, append));

        if (!append || !new File(rutaArchivo).exists()) {
            super.writeStreamHeader();

        }
    }

    @Override
    protected void writeStreamHeader() throws IOException {

    }
}
