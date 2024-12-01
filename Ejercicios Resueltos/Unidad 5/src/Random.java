public class Random {
    public static void main(String[] args) {

    int i, num, max=100, min=199, suma=0;

       for(i=1;i<=50;i++) {
           num = (int)(Math.random()*(199-100+1)+100);
           System.out.print(num+" ");

            if (num>max) {
                max = num;
            }
            if (num<min) {
                min = num;
            }
            suma+=num;
        }
       double media = (double)suma/50;
       System.out.println("\nMaximo: "+max+"\nMínimo: "+min+"\nMedia: "+media);
    }
}
