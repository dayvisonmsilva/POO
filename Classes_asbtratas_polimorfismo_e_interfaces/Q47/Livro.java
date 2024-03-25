package Classes_asbtratas_polimorfismo_e_interfaces.Q47;

// Classe Livro Abstrata
public abstract class Livro {
    protected String titulo;
    protected String autor;
    protected int numeroDePaginas;
    protected int anoDaEdicao;

    public Livro(String titulo, String autor, int numeroDePaginas, int anoDaEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDaEdicao = anoDaEdicao;
    }

    public String qualTitulo() {
        return titulo;
    }

    public String qualAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", anoDaEdicao=" + anoDaEdicao +
                '}';
    }
}
