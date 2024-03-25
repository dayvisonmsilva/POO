package Q37;
import java.util.Random;

public class DemoLancadorDeDados {
    public static void main(String[] args) {
        int[] somasQuantidade = new int[13];
        int num1 = 0;
        int num2 = 0;
        Random random = new Random();

        for (int i = 0; i < 18000000; i++) {
            num1 = random.nextInt(6) + 1;
            num2 = random.nextInt(6) + 1;
            somasQuantidade[num1+num2]++;
        }

        for (int i = 2; i <= 12; i++) {
            System.out.println("A soma " + i + " apareceu " + somasQuantidade[i] + " vezes.");
        }
    } 
}
