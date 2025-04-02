package ejercicios.ej09.codificador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Codificador {
    private HashMap<Character, Character> cifrado;


    public Codificador() {
        this.cifrado = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            cifrado.put((char)('a'+i), (char) (i+Math.random()*100));
        }
        for (int i = 0; i < 26; i++) {
            cifrado.put((char)('A'+i), (char) (i+Math.random()*100));
        }
    }
    public Codificador(HashMap<Character, Character> cifrado) {
        this.cifrado = cifrado;
    }

    public HashMap<Character, Character> getCifrado() {
        return cifrado;
    }
    public void setCifrado(HashMap<Character, Character> cifrado) {
        this.cifrado = cifrado;
    }

    public String cifrar(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (cifrado.containsKey(letra)) {
                resultado.append(cifrado.get(letra));
            } else {
                resultado.append(letra);
            }
        }
        return resultado.toString();
    }
    public String descifrar(String texto, HashMap<Character,Character> cifrado) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (cifrado.containsValue(letra)) {
                for (Map.Entry<Character, Character> entry : cifrado.entrySet()) {
                    if (entry.getValue() == letra) {
                        resultado.append(entry.getKey());
                        break;
                    }
                }
            } else {
                resultado.append(letra);
            }
        }
        return resultado.toString();
    }



    @Override
    public String toString() {
        String cad = "";
        for (Map.Entry<Character, Character> entradas : cifrado.entrySet()) {
            cad += entradas.getKey() + " -> " + entradas.getValue() + "\n";
        }
        return cad;
    }
}
