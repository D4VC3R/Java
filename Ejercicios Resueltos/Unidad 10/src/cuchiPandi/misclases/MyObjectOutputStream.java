package cuchiPandi.misclases;

import java.io.*;

public class MyObjectOutputStream extends ObjectOutputStream {
    static boolean existe;
    public MyObjectOutputStream(String rutaArchivo) throws IOException {
        super(crearArchivo(rutaArchivo));
    }

    private static FileOutputStream crearArchivo(String rutaArchivo) throws FileNotFoundException {
        if (new File(rutaArchivo).exists())
            existe = true;
        return new FileOutputStream(rutaArchivo,true);

    }

    @Override
    protected void writeStreamHeader() throws IOException {
        if (!existe)
            super.writeStreamHeader();
    }
}
