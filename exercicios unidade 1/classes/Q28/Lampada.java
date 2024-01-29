package classes.Q28;

public class Lampada {
    private boolean estadoDaLampada;
    private Contador contador;

    public Lampada() {
        this.estadoDaLampada = false;
        this.contador = new Contador(0);
    }

    public void acende() {
        this.estadoDaLampada = true;
        contador.incrementar();
    }

    public void apaga() {
        this.estadoDaLampada = false;
    }

    public boolean estaLigada() {
        return this.estadoDaLampada;
    }

    public void mostraEstado() {
        String mensagem = estadoDaLampada ? "A lampada esta acesa" : "A lampada esta apagada";
        System.out.println(mensagem);
    }

    public void vezesAcesa() {
        System.out.println("A lâmpada foi acesa " + this.contador.getValor() + " vezes.");
    }
}
