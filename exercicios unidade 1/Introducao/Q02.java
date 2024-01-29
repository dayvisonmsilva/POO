package Introducao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        scanner.close();

        // Calcula a soma dos três números
        double soma = somaDasNotas(nota1, nota2, nota3);

        // Calcula a média aritmética dos três números
        double media = mediaAritmetica(nota1, nota2, nota3);

        // Formata a saída para exibir apenas uma casa decimal
        DecimalFormat formato = new DecimalFormat("#0.00");
        String somaFormatada = formato.format(soma);
        String mediaFormatada = formato.format(media);
        formato.clone();

        System.err.println("A soma das notas é: " + somaFormatada);
        System.out.println("A média aritmética das notas é: " + mediaFormatada);
    }

    public static double somaDasNotas(double nota1, double nota2, double nota3) {
        return nota1 + nota2 + nota3;
    }

    public static double mediaAritmetica(double nota1, double nota2, double nota3) {
        return somaDasNotas(nota1, nota2, nota3) / 3;
    }
}
