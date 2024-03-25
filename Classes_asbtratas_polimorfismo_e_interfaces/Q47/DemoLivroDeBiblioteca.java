package Classes_asbtratas_polimorfismo_e_interfaces.Q47;

// Classe DemoLivroDeBiblioteca
public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca("O Senhor dos Anéis", "J.R.R. Tolkien", 1200, 1954, "Corredor 5, Prateleira B");
        System.out.println(livro.descricao());
        System.out.println("Está emprestado? " + livro.estaEmprestado());
        livro.empresta();
        System.out.println("Está emprestado? " + livro.estaEmprestado());
        livro.devolve();
        System.out.println("Está emprestado? " + livro.estaEmprestado());
    }
}