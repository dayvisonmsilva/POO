package Colecoes_genericas.Q48;

import java.util.*;

public class ListasListadas {
    public static void main(String[] args) {
        // Cria a lista1 com 10 caracteres usando o construtor LinkedList
        LinkedList<Character> lista1 = new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'));
        LinkedList<Character> lista2 = new LinkedList<>();

        // Usa um Iterator para percorrer a lista1 do fim ao início
        ListIterator<Character> iterator = lista1.listIterator(lista1.size());
        while (iterator.hasPrevious()) {
            lista2.add(iterator.previous());
        }

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
    }
}

