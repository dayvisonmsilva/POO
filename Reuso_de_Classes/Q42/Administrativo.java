package Reuso_de_Classes.Q42;

public class Administrativo extends Assistente{
    private String departamento;
    private boolean turnoNoturno;

    public Administrativo(String nome, double salario, String numMatricula, String departamento) {
        super(nome, salario, numMatricula);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean isTurnoNoturno() {
        return turnoNoturno;
    }

    public void setTurnoNoturno(boolean turnoNoturno) {
        this.turnoNoturno = turnoNoturno;
    }
    
    public double ganhoAnual (int numMesesTrabalhados, double valorAumento) {
        // Calcula o ganho anual baseado no turno e no valor do aumento
        double ganhoAnual;
        if (turnoNoturno) {
            double ganhoAnualBase = super.ganhoAnual(numMesesTrabalhados);
            double decimoTerceiro = super.cauculaDecimoTerceiro(numMesesTrabalhados);
            ganhoAnual = (ganhoAnualBase - decimoTerceiro) * ((valorAumento / 100) + 1) + decimoTerceiro;
        } else {
            super.aumentarSalario(valorAumento);
            ganhoAnual = super.ganhoAnual(numMesesTrabalhados);
        }
        return ganhoAnual;
    }

    @Override
    public String toString() {
        return super.toString() + " | departamento=" + departamento + " | turnoNoturno=" + turnoNoturno;
    }  
}
