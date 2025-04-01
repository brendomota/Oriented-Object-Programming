package br.unesp.rc.lista01exercicio02.repositorio;

import br.unesp.rc.lista01exercicio02.modelo.Curso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class CursoRepositorio {
    
    List<Curso> cursos = new ArrayList<>();

    public CursoRepositorio() {
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public void adicionar(Curso curso){
        cursos.add(curso);
    }
    
    public void imprimir(){
        System.out.println("---");
        for(Curso c : cursos){
            System.out.println(c);
        }
    }
    
    public void calcularMaiorRelacao(){
        
        int codigoMaior = -1;
        double maiorRelacao= -1;
        
        for(Curso c : cursos){
            
            if(c.calcularRelacaoCandidatoVaga() > maiorRelacao){
                maiorRelacao = c.calcularRelacaoCandidatoVaga();
                codigoMaior = c.getCodigo();
            }
        }
        System.out.printf("\nA maior relacao pertence ao curso de codigo: %d, e sua relacao: %.2f", codigoMaior, maiorRelacao);
    }
}
