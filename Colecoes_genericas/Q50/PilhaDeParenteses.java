package Colecoes_genericas.Q50;

import java.util.Stack;

public class PilhaDeParenteses {
    public static void main(String[] args) {
        String entrada = "(()()))";
        System.out.println(verificarBalanceamento(entrada));
    }

    public static boolean verificarBalanceamento(String entrada) {
        Stack<Character> pilha = new Stack<>();

        for (char ch : entrada.toCharArray()) {
            if (ch == '(') {
                pilha.push(ch);
            } else if (ch == ')') {
                if (pilha.isEmpty()) {
                    return false; // Não há '(' correspondente
                }
                pilha.pop(); // Remove o '(' correspondente do topo da pilha
            }
        }

        return pilha.isEmpty(); // Se a pilha estiver vazia, a string está balanceada
    }
}
