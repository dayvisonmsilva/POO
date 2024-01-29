package classes.Q25;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("2022010106", "Dayvison", 9.8, 10, 9.2);
        aluno1.exibirStatusAluno();

        System.out.println("");

        Aluno aluno2 = new Aluno("2022010133", "Francisco", 3, 3, 3);
        aluno2.exibirStatusAluno();
    }
}
