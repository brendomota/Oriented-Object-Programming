package br.unesp.rc.lista01exercicio01.repositorio;

import br.unesp.rc.lista01exercicio01.modelo.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class PessoaRepositorio {
    
    List<Pessoa> pessoas = new ArrayList<>();

    public PessoaRepositorio() {
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    public void adicionar(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    
    public void imprimir(){
        System.out.println("---");
        for(Pessoa p : pessoas){
            System.out.println(p);
        }
    }
}
