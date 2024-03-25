package Reuso_de_Classes.Q42;

public class Tecnico extends Assistente{
    private String areaTecnica;

    public Tecnico(String nome, double salario, String numMatricula, String areaTecnica) {
        super(nome, salario, numMatricula);
        this.areaTecnica = areaTecnica;
    }

    public String getAreaTecnica() {
        return areaTecnica;
    }

    public void setAreaTecnica(String areaTecnica) {
        this.areaTecnica = areaTecnica;
    }

    public double ganhoAnual (int numMesesTrabalhados, double valorAumento) {
        super.aumentarSalario(valorAumento);
        return super.ganhoAnual(numMesesTrabalhados); 
    }

    @Override
    public String toString() {
        return super.toString() + " | areaTecnica=" + areaTecnica;
    }
}
