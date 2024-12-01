public class Actividad1 {
    public static void main(String[] args) {

        Actividad1 programa = new Actividad1();
        programa.inicio();
    }

    private void inicio() {

        int[] nArray=getArray(12);
        asignarNum(nArray);
        imprimirResultado(getResultado(nArray));

    }

    private void imprimirResultado(String resultado) {
        System.out.println(resultado);
    }

    private String getResultado(int[] nArray) {
        String resultado = "";
        for (int i = 0; i < nArray.length; i++) {
            resultado += nArray[i] + " ";
        }
        return resultado;
    }

    private void asignarNum(int[] nArray) {
        nArray[0]=39;
        nArray[1]=-2;
        nArray[4]=0;
        nArray[6]=14;
        nArray[8]=5;
        nArray[9]=120;
    }

    private int[] getArray(int i) {
        return new int[i];
    }
}
