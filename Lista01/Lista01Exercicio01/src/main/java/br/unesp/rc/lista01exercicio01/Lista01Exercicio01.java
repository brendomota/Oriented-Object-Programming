package br.unesp.rc.lista01exercicio01;

import br.unesp.rc.lista01exercicio01.modelo.Pessoa;
import br.unesp.rc.lista01exercicio01.repositorio.PessoaRepositorio;

/**
 *
 * @author User
 */
public class Lista01Exercicio01 {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("Brendo", 47814665833L, 1555.90);
        Pessoa pessoa2 = new Pessoa("Gabriel", 87291774633L, 700);
        Pessoa pessoa3 = new Pessoa("Renan", 10983746522L, 2500);
        Pessoa pessoa4 = new Pessoa("Erick", 90872633541L, 3500);
        Pessoa pessoa5 = new Pessoa("Bia", 91827300844L, 5000);
        
        PessoaRepositorio preositorio = new PessoaRepositorio();
        preositorio.adicionar(pessoa1);
        preositorio.adicionar(pessoa2);
        preositorio.adicionar(pessoa3);
        preositorio.adicionar(pessoa4);
        preositorio.adicionar(pessoa5);
        preositorio.imprimir();

        for(Pessoa p : preositorio.getPessoas()){
            System.out.println("---");
            System.out.printf("\nSalario: R$%.2f", p.getSalario());
            System.out.printf("\nImposto: R$%.2f", p.calcularImposto());
            System.out.printf("\nSalario sem IR: R$%.2f", (p.getSalario() - p.calcularImposto()));
        }
    }
}
