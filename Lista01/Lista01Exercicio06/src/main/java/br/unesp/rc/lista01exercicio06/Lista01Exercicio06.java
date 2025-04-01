package br.unesp.rc.lista01exercicio06;

import br.unesp.rc.lista01exercicio06.modelo.Matriz;
import br.unesp.rc.lista01exercicio06.utilitario.Teclado;

/**
 *
 * @author User
 */
public class Lista01Exercicio06 {

    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();
        System.out.printf("\nInforme o tamamnho N de linhas e colunas: ");
        int tamanho = teclado.lerInt();
        
        Matriz matriz = new Matriz();
        matriz.gerarMatriz(tamanho);
        matriz.imprimir();
        
        int[] vetorMaior = new int[matriz.getNumeros().length];
        matriz.gerarVetorMaiorElementoLinhas(vetorMaior);
                
        int[] vetorMenor = new int[matriz.getNumeros().length];
        matriz.gerarVetorMenorElementoColunas(vetorMenor);
    }
}
