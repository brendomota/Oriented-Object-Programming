package br.unesp.rc.lista01exercicio02;

import br.unesp.rc.lista01exercicio02.modelo.Curso;
import br.unesp.rc.lista01exercicio02.repositorio.CursoRepositorio;

/**
 *
 * @author User
 */
public class Lista01Exercicio02 {

    public static void main(String[] args) {
        
        Curso c1 = new Curso(1, 60, 70, 30);
        Curso c2 = new Curso(2, 65, 60, 15);
        Curso c3 = new Curso(3, 50, 80, 20);
        Curso c4 = new Curso(4, 20, 20, 60);
        Curso c5 = new Curso(5, 80, 40, 40);
        
        CursoRepositorio crepositorio = new CursoRepositorio();
        crepositorio.adicionar(c1);
        crepositorio.adicionar(c2);
        crepositorio.adicionar(c3);
        crepositorio.adicionar(c4);
        crepositorio.adicionar(c5);
        crepositorio.imprimir();
        
        for(Curso c : crepositorio.getCursos()){
            System.out.printf("\n---");
            System.out.printf("\nCurso %d", c.getCodigo());
            System.out.printf("\nRelacao Candidato/Vaga: %.2f", c.calcularRelacaoCandidatoVaga());
            System.out.printf("\nPorcentagem de candidatos sexo feminino: %.2f", c.calcularPorcentagemCandidatosFeminino());
            System.out.printf("\nTotal de candidatos: %d", c.calcularTotalCandidatos());
        }
        
        System.out.printf("\n---");
        crepositorio.calcularMaiorRelacao();
    }
}
