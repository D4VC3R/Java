import java.util.Scanner;
public class Rombo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, filas, blancos=0, asteriscos=0, blancos2, asteriscos2;


        System.out.print("Filas: ");
        filas = sc.nextInt();

        for (i=1; i<=filas; i++){

            for(blancos=1;blancos<=filas-i;blancos++){
                System.out.print(" ");
            }

            //Asteriscos
            for(asteriscos=1; asteriscos<=(i*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (i=1;i<=filas;i++){
            for(blancos2=blancos;blancos2>=0;blancos2--){
                System.out.print(" ");

            }
            for(asteriscos2=asteriscos; asteriscos2<=0; asteriscos2--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
