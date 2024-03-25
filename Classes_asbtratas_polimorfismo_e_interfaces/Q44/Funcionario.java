package Classes_asbtratas_polimorfismo_e_interfaces.Q44;

public class Funcionario {
    private double salarioPorHora;
    private String nome;
    private String telefone;
    
    // construtor salarioPorHora, nome, telefone
    public Funcionario(double salarioPorHora, String nome, String telefone) {
        this.salarioPorHora = salarioPorHora;
        this.nome = nome;
        this.telefone = telefone;
    }

    // construtor nome
    public Funcionario(String nome){
        this.nome = nome;
        this.salarioPorHora = 2.0;
        this.telefone = "000-000";
    }
    
    // construtor salarioPorHora, nome
    public Funcionario(double salarioPorHora, String nome){
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.telefone = "000-000";
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }
    
    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double calculaSalario (int horasTrabalhadas) {
        return horasTrabalhadas * this.salarioPorHora;
    }

    @Override
    public String toString() {
        return "Nome = " + this.nome + 
        ", SalarioPorHora = " + this.salarioPorHora  + ", Telefone = " + this.telefone;
    } 
}