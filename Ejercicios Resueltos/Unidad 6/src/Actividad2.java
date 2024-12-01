public class Actividad2 {
    public static void main(String[] args) {

        Actividad2 programa = new Actividad2();
        programa.inicio();
    }

    private void inicio() {

        char [] array = getArray(10);

        asignarValores(array);
        imprimirResultado(getResultado(array));
    }

    private void imprimirResultado(String resultado) {
        System.out.println(resultado);
    }

    private String getResultado(char[] array) {
        String resultado = "";
        for (int i = 0; i < array.length; i++) {
            resultado += array[i]+" ";
        }
        return resultado;
    }

    private void asignarValores(char[] array) {
        array[0] = 'a';
        array[1] = 'x';
        array[4] = '@';
        array[6] = ' ';
        array[7] = '+';
        array[8] = 'Q';
    }

    private char[] getArray(int i) {
        return new char[i];
    }
}
