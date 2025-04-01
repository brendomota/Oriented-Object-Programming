package br.unesp.rc.lista02exercicio02.repositorio;

import br.unesp.rc.lista02exercicio02.modelo.Voto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class VotoRepositorio {
    
    static List<Voto> votos = new ArrayList<>();

    public VotoRepositorio() {
    }

    public static List<Voto> getVotos() {
        return votos;
    }

    public static void setVotos(List<Voto> votos) {
        VotoRepositorio.votos = votos;
    }
    
    public void adicionar(Voto v){
        votos.add(v);
    }
    
    public void imprimir(){
        for(Voto v : votos){
            System.out.println(v);
        }
    }
}
