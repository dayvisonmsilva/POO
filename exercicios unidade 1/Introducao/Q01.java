package Introducao;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Cria um scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir o lado do quadrado
        System.out.print("Digite o comprimento do lado do quadrado: ");

        // Lê o valor inserido pelo usuário
        double lado = scanner.nextDouble();

        // Fecha o scanner, pois não será mais utilizado
        scanner.close();

        // Calcula a área do quadrado
        double area = calcularAreaQuadrado(lado);

        // Exibe o resultado
        System.out.println("A área do quadrado com lado " + lado + " é: " + area);
    }

    // Método para calcular a área do quadrado
    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }
}