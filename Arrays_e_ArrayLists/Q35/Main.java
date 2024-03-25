import classes.Cliente;
import classes.RegistroClientes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegistroClientes RC = new RegistroClientes();
        int id = 0;
        int idade;
        String nome;
        String telefone;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite o ID do cliente: ");
            id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o nome do cliente: ");
            nome = scanner.nextLine();
            System.out.print("Digite a idade do cliente: ");
            idade = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o telefone do cliente: ");
            telefone = scanner.nextLine();
            System.out.println(" ");
            Cliente cliente = new Cliente(id, idade, nome, telefone);

            if (id >= 0) 
                RC.adicionarCliente(cliente);
        } while (id >= 0);

        RC.listaClientes();
        scanner.close();
    }
}