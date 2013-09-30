package br.com.matheusdagostim.model;

public abstract class Pessoa {

    private int codigo;
    private String nome;
    private String endereco;

    public Pessoa() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "Código: " + codigo + "\nNome: " + nome + "\nEndereço: " + endereco;
    }
}
