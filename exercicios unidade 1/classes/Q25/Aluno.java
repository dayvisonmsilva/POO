package classes.Q25;

public class Aluno {
    private String matricula;
    private String nome;
    private double nota1;
    private double nota2;
    private double notaTrabalho;

    // construtor
    public Aluno(String matricula, String nome, double nota1, double nota2, double notaTrabalho) {
        setMatricula(matricula);
        setNome(nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double mediaParcial() {
        return ((2.5 * this.nota1) + (2.5 * this.nota2) + (2 * this.notaTrabalho)) / 7;
    }

    public double provaFinal() {
        double MP = mediaParcial();
        if (mediaParcial() < 3 || mediaParcial() >= 7) {
            return 0.0;
        }
        return (5 - 0.6 * MP) / 0.4;
    }

    public void exibirStatusAluno() {
        System.out.println("Aluno: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nota 1: " + this.nota1 + " | Nota 2: " + this.nota2 + " | Trabalho: " + this.notaTrabalho);
        System.out.printf("Média parcial: %.2f\n", mediaParcial());
        if (provaFinal() == 0.0) {
            System.out.println("Sem exame final!");
        } else {
            System.out.printf("Vai para exame final precisando de: %.2f\n", provaFinal());
        }
    }
}
