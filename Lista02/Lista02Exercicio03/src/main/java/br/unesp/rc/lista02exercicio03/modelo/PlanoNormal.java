package br.unesp.rc.lista02exercicio03.modelo;

import java.util.Date;

/**
 *
 * @author User
 */
public class PlanoNormal extends Plano{

    @Override
    public String getNome() {
        return "Normal";
    }

    @Override
    public Date getDate() {
        return new Date();
    }

    @Override
    public double getValorMensal() {
        return 50;
    }

}
