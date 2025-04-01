package br.unesp.rc.lista03exercicio01;

import br.unesp.rc.lista03exercicio01.modelo.Formatador;

/**
 *
 * @author User
 */
public class Lista03Exercicio01 {

    public static void main(String[] args) {
        
        String nome = "Erick Mota Pereira Custodio";
        System.out.println("Nome: " + nome);
        
        Formatador format = new Formatador(nome);
        
        System.out.println("ABNT: " + format.formatarABNT());
    }
}
