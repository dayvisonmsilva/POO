package Introducao;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura (graus centígrados): ");
        double grausCelsius = scanner.nextDouble();
        scanner.close();

        System.out.printf("A temperatura em Fahrenheit é: %.2lf °F\n", grausToFahrenheit(grausCelsius));
    }

    public static double grausToFahrenheit(double grausCelsius) {
        return (grausCelsius * 9 / 5) + 32;
    }
}
