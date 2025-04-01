package br.unesp.rc.lista01exercicio05;

import br.unesp.rc.lista01exercicio05.modelo.Matriz;
import br.unesp.rc.lista01exercicio05.utilitario.Teclado;

/**
 *
 * @author User
 */
public class Lista01Exercicio05 {

    public static void main(String[] args) {
        System.out.printf("\nInforme o tamamho de linhas e colunas: ");
        Teclado teclado = new Teclado();
        int size = teclado.lerInt();
        
        Matriz matriz = new Matriz();
        matriz.gerarMatriz(size);
        matriz.imprimir();
        
        System.out.printf("Soma da diagonal secundaria: %d", matriz.calcularSomaDiagonalSecundaria());
        
        System.out.printf("\nTriangular superior: \n");
        matriz.calcularTriangulasSuperior();
        
        System.out.printf("\nProduto da diagonal principal: %d", matriz.calcularProdutoDiagonalPrincipal());
    }
}
