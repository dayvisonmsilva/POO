package Introducao;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2, numero3, menor;
        System.out.println("Digite 3 (três) números inteiros: ");
        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt();
        menor = numero1;

        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt();
        menor = (numero2 < menor) ? numero2 : menor;

        System.out.print("Digite o terceiro número: ");
        numero3 = input.nextInt();
        menor = (numero3 < menor) ? numero3 : menor;
        input.close();

        System.out.println("O menor número digitado foi: " + menor);
    }
}
