package br.unesp.rc.lista01exercicio04;

import br.unesp.rc.lista01exercicio04.modelo.Vetor;

/**
 *
 * @author User
 */
public class Lista01Exercicio04 {

    public static void main(String[] args) {
        
        Vetor vetor1 = new Vetor();
        vetor1.gerarVetor();
        System.out.printf("\nVetor1: ");
        vetor1.imprimir();
        System.out.printf("\n---");
        
        int vetorAux[] = {9, 0, -8, 7, 2, 3, -1, -8, 9, 10}; 
        Vetor vetor2 = new Vetor();
        vetor2.setNumeros(vetorAux);
        System.out.printf("\nVetor2: ");
        vetor2.imprimir();
        
        Vetor vetor3 = new Vetor();
        vetor3.setNumeros(vetor2.retirarNulosNegativos());
        System.out.printf("\n---");
        System.out.printf("\nVetor3: ");
        vetor3.imprimir();
    }
}
