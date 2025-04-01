package br.unesp.rc.lista01exercicio03;

import br.unesp.rc.lista01exercicio03.modelo.Vetor;
import br.unesp.rc.lista01exercicio03.utilitario.Teclado;

/**
 *
 * @author User
 */
public class Lista01Exercicio03 {

    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();
        System.out.println("Informe o tamanho do vetor: ");
        int tamanho = teclado.lerInt();
        
        Vetor vetor = new Vetor();
        
        vetor.gerarElementos(tamanho);
        
        vetor.imprimirVetor();
        
        System.out.printf("\nSoma dos elementos: %d", vetor.somarElementos());
        
        System.out.printf("\n---");
        Vetor vetor2 = new Vetor();
        vetor2.setNumeros(vetor.ordenarCrescente());
        System.out.printf("\nVetor na ordem crescente: \n");
        vetor2.imprimirVetor();
        
        System.out.printf("\n---");
        System.out.printf("\nMaior elemento do Vetor: %d", vetor.calcularMaiorElementos());
    }
}
