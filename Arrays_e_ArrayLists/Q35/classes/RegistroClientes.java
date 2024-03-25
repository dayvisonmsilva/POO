package classes;
import java.util.ArrayList;

public class RegistroClientes {
    private ArrayList<Cliente> clientes;

    public RegistroClientes () {
        this.clientes = new ArrayList<>();
    }
    
    public void adicionarCliente (Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void listaClientes () {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
