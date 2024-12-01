/* Haz un programa que solicite un nombre de usuario y contraseña. Si coincide
con las que tenéis almacenadas a las variables anteriores, visualizaréis por
pantalla ‘’Bienvenidos al sistema’’. En caso contrario, volveréis a solicitar la
misma información. El usuario tendrá 3 intentos para entrar en el sistema.
Probados los 3 intentos se visualizará por pantalla ‘’Superado el número de
intentos permitidos’’ y finalizará el programa.*/
import java.util.Scanner;
public class Actividad34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String pass, user, passIn, userIn;
        int intentos = 3;

        user = "JuanPalomo";
        pass = "YoMeLoGuisoYoMeLoComo123";
        boolean fin = false;

        do {
            System.out.print("Usuario: ");
            userIn = sc.next();
            System.out.print("Contraseña: ");
            passIn = sc.next();

            if (passIn.equals(pass)&&userIn.equals(user)){
                System.out.println("Bienvenido.");
                fin = true;
            }else{
                intentos--;
                System.out.println("Quedan "+intentos+" intentos.");
                if (intentos==0){
                    System.out.println("No quedan intentos.");
                    fin = true;
                }
            }

        }while(!fin);



    }
}
