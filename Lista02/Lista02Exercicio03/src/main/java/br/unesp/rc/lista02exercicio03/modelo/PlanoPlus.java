package br.unesp.rc.lista02exercicio03.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author User
 */
public class PlanoPlus extends Plano{

    private int NUMERO_MAXIMO_DEPENDENTES = 3;
    
    private List<Socio> amigos = new ArrayList<>();

    public PlanoPlus() {
    }

    public List<Socio> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Socio> amigos) {
        this.amigos = amigos;
    }
    
    public boolean adicionarAmigos(Socio amigo){
        if(amigos.size() < NUMERO_MAXIMO_DEPENDENTES){
            return amigos.add(amigo);
        }
        return false;
    }
           
    @Override
    public String getNome() {
       return "Plus";
    }

    @Override
    public Date getDate() {
        return new Date();
    }

    @Override
    public double getValorMensal() {
        return 200;
    }
    
}
