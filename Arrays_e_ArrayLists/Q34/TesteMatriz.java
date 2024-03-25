package Q34;

public class TesteMatriz {
    public static void main(String[] args) {
        Matriz m = new Matriz(1.0f, 2.0f, 3.0f, 4.0f);
        System.out.println("Matriz:");
        System.out.println(m);
        System.out.println("Determinante: " + m.determinante());
    }
}