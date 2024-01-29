package Introducao;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ângulo em graus: ");
        double anguloGraus = scanner.nextDouble();
        scanner.close();

        // Converte o ângulo para radianos
        double anguloRadianos = Math.toRadians(anguloGraus);

        // Calcula as funções trigonométricas
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);
        double cossecante = 1 / seno;
        double secante = 1 / cosseno;
        double cotangente = 1 / tangente;

        System.out.println("Ângulo em radianos: " + anguloRadianos);
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Cossecante: " + cossecante);
        System.out.println("Secante: " + secante);
        System.out.println("Cotangente: " + cotangente);
    }
}
