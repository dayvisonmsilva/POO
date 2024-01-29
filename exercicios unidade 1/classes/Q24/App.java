package classes.Q24;

public class App {
    public static void main(String[] args) {
        // Criando uma instância de Fatura
        Fatura fatura = new Fatura("123", "Teclado", -2, 25.0);

        // Exibindo detalhes da fatura
        fatura.exibirDetalhes();
    }
}
