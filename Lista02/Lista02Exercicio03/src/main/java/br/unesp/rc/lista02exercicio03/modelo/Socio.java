package br.unesp.rc.lista02exercicio03.modelo;

/**
 *
 * @author User
 */
public class Socio {
    
    private String nome;
    private String cpf;
    private Plano plano;

    public Socio() {
    }

    public Socio(String nome, String cpf, Plano plano) {
        this.nome = nome;
        this.cpf = cpf;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    @Override
    public String toString() {
        return "Socio{" + "nome=" + nome + ", cpf=" + cpf + ", plano=" + plano + '}';
    }
    
    
}
