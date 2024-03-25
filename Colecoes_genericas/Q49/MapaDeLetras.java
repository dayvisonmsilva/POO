package Colecoes_genericas.Q49;

import java.util.*;

public class MapaDeLetras {
    public static void main(String[] args) {
        String frase = "HELLO THERE";
        Map<Character, Integer> mapa = new TreeMap<>();

        for (char letra : frase.toCharArray()) {
            if (Character.isLetter(letra)) {
                letra = Character.toUpperCase(letra);
                mapa.put(letra, mapa.getOrDefault(letra, 0) + 1);
            }
        }

        for (char letra : mapa.keySet()) {
            System.out.println(letra + ": " + mapa.get(letra));
        }
    }
}

