package classes.Q29;

public class App {
    public static void main(String[] args) {
        NumeroComplexo nc1 = new NumeroComplexo(2, 4);
        NumeroComplexo nc2 = new NumeroComplexo(3);
        NumeroComplexo nc3 = new NumeroComplexo();

        System.out.println(nc1); // Deve imprimir "2.0 + 4.0i"
        System.out.println(nc2); // Deve imprimir "3.0 + 0.0i"
        System.out.println(nc3); // Deve imprimir "0.0 + 0.0i"
    }
}
