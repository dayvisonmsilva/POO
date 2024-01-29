package classes.Q28;

public class Contador {
    private int valor;

    public Contador(int valor) {
        this.valor = valor;
    }

    public void zerar() {
        this.valor = 0;
    }

    public void incrementar() {
        this.valor++;
    }

    public int getValor() {
        return valor;
    }
}
