package br.unesp.rc.lista02exercicio02.modelo;

import java.util.Date;

/**
 *
 * @author User
 */
public class Voto {
    
    private Eleitor eleitor;
    private Candidato candidato;
    private Date data;

    public Voto() {
    }

    public Voto(Eleitor eleitor, Candidato candidato, Date data) {
        this.eleitor = eleitor;
        this.candidato = candidato;
        this.data = data;
    }

    public Eleitor getEleitor() {
        return eleitor;
    }

    public void setEleitor(Eleitor eleitor) {
        this.eleitor = eleitor;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Voto{" + "eleitor=" + eleitor + ", candidato=" + candidato + ", data=" + data + '}';
    }
    
    
}
