import java.util.Scanner;

public class Login {
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
