package classes.Q28;

public class App {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.acende();
        lampada.mostraEstado(); // Deve imprimir "A lâmpada está acesa."
        lampada.vezesAcesa(); // Deve imprimir "A lâmpada foi acesa 1 vezes."
        lampada.apaga();
        lampada.mostraEstado(); // Deve imprimir "A lâmpada está apagada."
    }
}
