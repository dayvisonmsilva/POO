package Classes_asbtratas_polimorfismo_e_interfaces.Q47;

public interface ItemDeBiblioteca {
    // Campo constante
    int maximoDeDiasParaEmprestimo = 14;

    // Métodos que as classes que implementam esta interface devem definir
    public boolean estaEmprestado();
    public boolean empresta();
    public boolean devolve();
    public String localizacao();
    public String descricao();
}
