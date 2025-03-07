package pruebas;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class ArchivoBinario {
    public static void main(String[] args) {

        int[] num = new int[10];

        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(System.getProperty("user.dir")+ File.separator+"src"+File.separator+"archivos"+File.separator+"Datos.txt"));
            for (int i = 0; i < num.length; i++) {
                num[i]=i;
            }
            for (int j : num) {
                out.writeInt(j);
            }
        } catch (IOException e) {
            System.out.println("Error archivo.");
        }
    }
}
