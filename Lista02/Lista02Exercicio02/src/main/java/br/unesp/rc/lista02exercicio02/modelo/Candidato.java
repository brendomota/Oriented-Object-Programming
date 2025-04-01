package br.unesp.rc.lista02exercicio02.modelo;

/**
 *
 * @author User
 */
public class Candidato {
    
    private int idCandidato;
    private String nome;
    private String siglaPartido;

    public Candidato() {
    }

    public Candidato(int idCandidato, String nome, String siglaPartido) {
        this.idCandidato = idCandidato;
        this.nome = nome;
        this.siglaPartido = siglaPartido;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSiglaPartido() {
        return siglaPartido;
    }

    public void setSiglaPartido(String siglaPartido) {
        this.siglaPartido = siglaPartido;
    }

    @Override
    public String toString() {
        return "Candidato{" + "idCandidato=" + idCandidato + ", nome=" + nome + ", siglaPartido=" + siglaPartido + '}';
    }
    
    
}
