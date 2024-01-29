package classes.Q27;

public class Contador {
    private int valor;

    public Contador() {
        zerar();
    }

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
