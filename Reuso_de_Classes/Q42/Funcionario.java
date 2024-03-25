package Reuso_de_Classes.Q42;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double cauculaDecimoTerceiro (int numMesesTrabalhados) {
        return ((this.salario/12)*numMesesTrabalhados);
    }

    // aumenta o salário em porcentagem
    public void aumentarSalario(double aumento) {
        this.salario = salario*((aumento/100)+1);
    }
    
    public double ganhoAnual (int numMesesTrabalhados) {
        return this.salario*12 + cauculaDecimoTerceiro(numMesesTrabalhados);
    }

    @Override
    public String toString() {
        return "nome=" + nome + "| salario=" + salario;
    }  
}
