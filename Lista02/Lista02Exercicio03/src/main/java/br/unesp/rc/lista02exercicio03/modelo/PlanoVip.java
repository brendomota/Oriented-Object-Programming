package br.unesp.rc.lista02exercicio03.modelo;

import java.util.Date;

/**
 *
 * @author User
 */
public class PlanoVip extends Plano{

    private Socio amigo;

    public Socio getAmigo() {
        return amigo;
    }

    public void setAmigo(Socio amigo) {
        this.amigo = amigo;
    }
            
    @Override
    public String getNome() {
        return "Vip";
    }

    @Override
    public Date getDate() {
        return new Date();
    }

    @Override
    public double getValorMensal() {
        return 100;
    }
    
}
