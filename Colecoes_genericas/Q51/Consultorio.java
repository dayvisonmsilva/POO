package Colecoes_genericas.Q51;
import java.util.*;;
public class Consultorio {
    public static void main(String[] args) {
        Queue<Paciente> filaComum = new LinkedList<>();
        Queue<Paciente> filaPrioritaria = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int rg = random.nextInt(99999999);
            int idade = random.nextInt(100);

            Paciente paciente = new Paciente(rg, idade);

            if (idade > 60) {
                filaPrioritaria.add(paciente);
            } else {
                filaComum.add(paciente);
            }
        }

        while (!filaPrioritaria.isEmpty() || !filaComum.isEmpty()) {
            if (!filaPrioritaria.isEmpty()) {
                Paciente paciente = filaPrioritaria.poll();
                System.out.println("Atendendo paciente " + paciente.rg + " da fila prioritária.");
            } else if (!filaComum.isEmpty()) {
                Paciente paciente = filaComum.poll();
                System.out.println("Atendendo paciente " + paciente.rg + " da fila comum.");
            }

            try {
                Thread.sleep(5000); // Simula o tempo de uma consulta (5 minutos)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}