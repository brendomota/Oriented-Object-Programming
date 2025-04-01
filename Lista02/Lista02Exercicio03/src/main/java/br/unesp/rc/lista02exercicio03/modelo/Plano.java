package br.unesp.rc.lista02exercicio03.modelo;

import java.util.Date;

/**
 *
 * @author User
 */
public abstract class Plano {
    
    private Socio proprietario;

    public Plano() {
    }

    public Plano(Socio proprietario) {
        this.proprietario = proprietario;
    }
        
    public Socio getProprietario() {
        return proprietario;
    }

    public void setProprietario(Socio proprietario) {
        this.proprietario = proprietario;
    }
    
    public abstract String getNome();
    
    public abstract Date getDate();
    
    public abstract double getValorMensal();
}
