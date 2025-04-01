package br.unesp.rc.lista01exercicio02.modelo;

/**
 *
 * @author User
 */
public class Curso {
    
    private int codigo;
    private int numeroVagas;
    private int candidatosMasculino;
    private int candidatosFeminino;

    public Curso() {
    }

    public Curso(int codigo, int numeroVagas, int candidatosMasculino, int candidatosFeminino) {
        this.codigo = codigo;
        this.numeroVagas = numeroVagas;
        this.candidatosMasculino = candidatosMasculino;
        this.candidatosFeminino = candidatosFeminino;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroVagas() {
        return numeroVagas;
    }

    public void setNumeroVagas(int numeroVagas) {
        this.numeroVagas = numeroVagas;
    }

    public int getCandidatosMasculino() {
        return candidatosMasculino;
    }

    public void setCandidatosMasculino(int candidatosMasculino) {
        this.candidatosMasculino = candidatosMasculino;
    }

    public int getCandidatosFeminino() {
        return candidatosFeminino;
    }

    public void setCandidatosFeminino(int candidatosFeminino) {
        this.candidatosFeminino = candidatosFeminino;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", numeroVagas=" + numeroVagas + ", candidatosMasculino=" + candidatosMasculino + ", candidatosFeminino=" + candidatosFeminino + '}';
    }
    
    public double calcularRelacaoCandidatoVaga(){
        
        return (double)(candidatosMasculino + candidatosFeminino)/numeroVagas;
    }
    
    public double calcularPorcentagemCandidatosFeminino(){
        
        return (double) candidatosFeminino/(candidatosFeminino+candidatosMasculino);
    }
    
    public int calcularTotalCandidatos(){
        
        return (int) candidatosFeminino + candidatosMasculino;
    }
}
