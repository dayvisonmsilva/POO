package Introducao;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int centena, dezena, unidade;
        System.out.print("Digite um número de 3 dígitos no formato CDU (Centena,Dezena e Unidade):");
        numero = input.nextInt();
        input.close();

        centena = numero / 100;
        dezena = (numero - (centena * 100)) / 10;
        unidade = (numero - (centena * 100)) - (dezena * 10);

        System.out.println("Número no formato UCD: " + unidade + dezena + centena);
    }
}
