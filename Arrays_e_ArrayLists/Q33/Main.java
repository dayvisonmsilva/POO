import classes.Agenda;
import classes.EntradaEmAgenda;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionarCompromisso(new EntradaEmAgenda(10, 1, 3, 2024, "Compromisso 1"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(11, 20, 3, 2024, "Compromisso 2"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(12, 23, 5, 2024, "Compromisso 3"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(13, 23, 3, 2024, "Compromisso 4"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(14, 23, 3, 2024, "Compromisso 5"));

        // Substitua 23, 3, 2024 pela data do seu aniversário
        agenda.listaDia(23, 3, 2024);
    }
}