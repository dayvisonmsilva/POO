package classes.Q24;

public class Fatura {
    // Atributos
    private String numeroIdentificacao;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    // Construtor
    public Fatura(String numeroIdentificacao, String descricao, int quantidade, double precoUnitario) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPrecoUnitario(precoUnitario);
    }

    // Métodos getters e setters
    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        // Garante que a quantidade seja não negativa
        this.quantidade = (quantidade > 0) ? quantidade : 0;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        // Garante que o preço seja não negativo
        this.precoUnitario = (precoUnitario > 0) ? precoUnitario : 0.0;
    }

    // Método para calcular o valor total da fatura
    public double calculaTotal() {
        return quantidade * precoUnitario;
    }

    // Método para exibir informações sobre a fatura
    public void exibirDetalhes() {
        System.out.println("Número de Identificação: " + numeroIdentificacao);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço Unitário: " + precoUnitario);
        System.out.println("Valor Total: " + calculaTotal());
    }
}
