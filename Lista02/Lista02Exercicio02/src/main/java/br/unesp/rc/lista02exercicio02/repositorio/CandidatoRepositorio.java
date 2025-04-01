package br.unesp.rc.lista02exercicio02.repositorio;

import br.unesp.rc.lista02exercicio02.modelo.Candidato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class CandidatoRepositorio {
    
    static List<Candidato> candidatos = new ArrayList<>();

    public CandidatoRepositorio() {
    }

    public static List<Candidato> getCandidatos() {
        return candidatos;
    }

    public static void setCandidatos(List<Candidato> candidatos) {
        CandidatoRepositorio.candidatos = candidatos;
    }
    
    public void adicionar(Candidato c){
        candidatos.add(c);
    }
    
    public void imprimir(){
        for(Candidato c : candidatos){
            System.out.println(c);
        }
    }
}
