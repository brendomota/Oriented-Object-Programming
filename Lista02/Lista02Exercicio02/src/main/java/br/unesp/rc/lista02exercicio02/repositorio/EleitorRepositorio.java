package br.unesp.rc.lista02exercicio02.repositorio;

import br.unesp.rc.lista02exercicio02.modelo.Eleitor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class EleitorRepositorio {
    
    static List<Eleitor> eleitores = new ArrayList<>();

    public EleitorRepositorio() {
    }

    public static List<Eleitor> getEleitores() {
        return eleitores;
    }

    public static void setEleitores(List<Eleitor> eleitores) {
        EleitorRepositorio.eleitores = eleitores;
    }
    
    public void adicionar(Eleitor e){
        eleitores.add(e);
    }
    
    public void imprimir(){
        for(Eleitor e : eleitores){
            System.out.println(e);
        }
    }
}
