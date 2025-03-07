package pruebas;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoTexto {

    public static void main(String[] args) {

            StringBuilder text = new StringBuilder();
            //Esto no vale, es muy lento. Mejor linea a linea (String readLine)
            try {
                BufferedReader in = new BufferedReader(new FileReader("/home/davcerval/IdeaProjects/Unidad 10/src/archivos/prueba.txt"));
                int c = in.read();

                while (c != -1) {
                    text.append((char) c);
                    c = in.read();
                }

                in.close();

            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
            System.out.println("Contenido del archivo:");
            System.out.println(text);
        }
    }



