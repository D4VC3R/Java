public class Actividad10 {
    public static void main(String[] args) {

        Actividad10 programa = new Actividad10();
        programa.inicio();
    }

    private void inicio() {

        int[] nums = getArray(20);
        String resultado;

        rellenarArray(nums);
        imprimirPantalla("Cadena aleatoria\n");
        imprimirArray(nums);

        resultado=getResultado(nums);
        imprimirPantalla("\nCadena ordenada\n"+resultado);

    }

    private void imprimirArray(int []nums) {
        for (int i=0;i< nums.length;i++){
            imprimirPantalla(nums[i]+" ");
        }
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private String getResultado(int[] nums) {
        String resultado = "", resultado2="";

        for (int i=0;i< nums.length;i++){
            if(isPar(nums[i])){
                resultado +=nums[i]+" ";
            }else
                resultado2 +=nums[i]+" ";
        }
        return resultado + resultado2;
    }

    private boolean isPar(int i) {
        return i%2==0;
    }

    private void rellenarArray(int[] nums) {
        for (int i=0;i< nums.length;i++){
            nums[i]=getAleatorio(100,0);
        }
    }

    private int getAleatorio(int max, int min) {
        return (int)(Math.random()*(max-min+1)+min);
    }


    private int[] getArray(int i) {
        return new int[i];
    }
}
