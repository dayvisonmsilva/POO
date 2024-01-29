package Introducao;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dias, horas, minutos, intervaloMinutos = 9257;
        /*
         * System.out.print("Digite um horário em minutos: ");
         * intervaloMinutos = input.nextInt();
         */
        input.close();
        dias = intervaloMinutos / (24 * 60); // 24 horas em um dia, 60 minutos em uma hora
        horas = (intervaloMinutos % (24 * 60)) / 60;
        minutos = intervaloMinutos % 60;

        System.out.println("DIA(S): " + dias);
        System.out.println("HORA(S): " + horas);
        System.out.println("MINUTO(S): " + minutos);
    }
}
