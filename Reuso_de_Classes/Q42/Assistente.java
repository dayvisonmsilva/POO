package Reuso_de_Classes.Q42;

public class Assistente extends Funcionario{
    private String numMatricula;

    public Assistente(String nome, double salario, String numMatricula) {
        super(nome, salario);
        this.numMatricula = numMatricula;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public String toString() {
        return super.toString() + " | numMatricula=" + numMatricula;
    }

}
