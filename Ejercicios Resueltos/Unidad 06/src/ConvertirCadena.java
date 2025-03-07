public class ConvertirCadena {
    public static void main(String[] args) {

        ConvertirCadena programa = new ConvertirCadena();
        programa.inicio();
    }

    private void inicio() {

        String cad = "La vida es muy bella.";
        char[] cad1 = convertirCadenaEnArray(cad);
        imprimirArray(cad1);
    }

    private void imprimirArray(char[] cad1) {
        for (int i=0;i<cad1.length;i++){
            System.out.print("'"+cad1[i]+"' ");
        }
    }

    private char[] convertirCadenaEnArray(String cad) {
        char[] cad1 = crearArrayChar(cad);
        for (int i=0;i<cad1.length;i++){
            cad1[i] = cad.charAt(i);
        }
        return cad1;
    }

    private char[] crearArrayChar(String cad) {
        return new char[cad.length()];
    }
}
