package Classes_asbtratas_polimorfismo_e_interfaces.Q47;

// Classe LivroDeBiblioteca
public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean emprestado;
    private String localizacao;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDaEdicao, String localizacao) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.localizacao = localizacao;
        this.emprestado = false;
    }

    @Override
    public boolean estaEmprestado() {
        return emprestado;
    }

    @Override
    public boolean empresta() {
        return emprestado = true;
    }

    @Override
    public boolean devolve() {
        return emprestado = false;
    }

    @Override
    public String localizacao() {
        return localizacao;
    }

    @Override
    public String descricao() {
        return toString();
    }

    @Override
    public String toString() {
        return super.toString() + ", emprestado=" + emprestado + ", localizacao='" + localizacao + '\'';
    }
}