package classes.Q27;

public class App {
    public static void main(String[] args) {
        Contador cont = new Contador(7);
        cont.incrementar();
        cont.incrementar();
        cont.incrementar();
        System.out.println(cont.getValor());
    }
}
