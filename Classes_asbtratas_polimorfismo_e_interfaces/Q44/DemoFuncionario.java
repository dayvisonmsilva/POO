package Classes_asbtratas_polimorfismo_e_interfaces.Q44;

public class DemoFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Gustavo");
        Funcionario funcionario2 = new Funcionario(125, "Dayvison");
        Funcionario funcionario3 = new Funcionario(153, "Maria Eduarda", "333-333");
    
        System.out.println(funcionario1 + "Salário: R$" + funcionario1.calculaSalario(50));
        System.out.println(funcionario2 + "Salário: R$" + funcionario2.calculaSalario(45));
        System.out.println(funcionario3 + "Salário: R$" + funcionario3.calculaSalario(40));
    }
}
