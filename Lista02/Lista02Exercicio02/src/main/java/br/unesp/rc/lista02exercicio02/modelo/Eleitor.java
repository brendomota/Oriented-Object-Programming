package br.unesp.rc.lista02exercicio02.modelo;

/**
 *
 * @author User
 */
public class Eleitor {
    
    private String nome;
    private String endereco;
    private int numeroFilhos;
    private String dataNascimento;
    private String estadoCivil;
    private String trabalho;
    private double rendaBrutaMensal;

    public Eleitor() {
    }

    public Eleitor(String nome, String endereco, int numeroFilhos, String dataNascimento, String estadoCivil, String trabalho, double rendaBrutaMensal) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroFilhos = numeroFilhos;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
        this.trabalho = trabalho;
        this.rendaBrutaMensal = rendaBrutaMensal;
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

    public int getNumeroFilhos() {
        return numeroFilhos;
    }

    public void setNumeroFilhos(int numeroFilhos) {
        this.numeroFilhos = numeroFilhos;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    public double getRendaBrutaMensal() {
        return rendaBrutaMensal;
    }

    public void setRendaBrutaMensal(double rendaBrutaMensal) {
        this.rendaBrutaMensal = rendaBrutaMensal;
    }

    @Override
    public String toString() {
        return "Eleitor{" + "nome=" + nome + ", endereco=" + endereco + ", numeroFilhos=" + numeroFilhos + ", dataNascimento=" + dataNascimento + ", estadoCivil=" + estadoCivil + ", trabalho=" + trabalho + ", rendaBrutaMensal=" + rendaBrutaMensal + '}';
    }
    
    
}
