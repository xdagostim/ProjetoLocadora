package br.com.matheusdagostim.model;

public class Produto {

    private int condigo;
    private String nome;
    private double valor;
    private CategoriaProduto categoria;
    private int quantidadeEstoque;

    public Produto() {
    }

    public int getCondigo() {
        return condigo;
    }

    public void setCondigo(int condigo) {
        this.condigo = condigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" + "condigo=" + condigo + ", nome=" + nome + ", valor=" + valor + ", categoria=" + categoria + ", quantidadeEstoque=" + quantidadeEstoque + '}';
    }
}
