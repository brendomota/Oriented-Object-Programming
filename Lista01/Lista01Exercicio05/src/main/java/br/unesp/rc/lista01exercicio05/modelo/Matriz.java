package br.unesp.rc.lista01exercicio05.modelo;

import java.util.Random;

/**
 *
 * @author User
 */
public class Matriz {

    private static final int MAX_VALOR_GERADO = 100;
    private int[][] numeros;

    public Matriz() {
    }

    public Matriz(int[][] numeros) {
        this.numeros = numeros;
    }

    public int[][] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[][] numeros) {
        this.numeros = numeros;
    }

    public void imprimir() {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.printf("%d   ", numeros[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public void gerarMatriz(int tamanho) {

        numeros = new int[tamanho][tamanho];

        Random rand = new Random();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = rand.nextInt(MAX_VALOR_GERADO + 1);
            }
        }
    }

    public int calcularSomaDiagonalSecundaria() {

        int soma = 0;
        for (int i = numeros.length - 1; i >= 0; i--) {
            for (int j = numeros[i].length - 1 - i; j < numeros[i].length; j++) {
                soma += numeros[i][j];
                break;
            }
        }
        return soma;
    }

    public void calcularTriangulasSuperior() {

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (j >= i) {
                    System.out.printf("%d    ", numeros[i][j]);
                } else {
                    System.out.printf("0     ");
                }
            }
            System.out.printf("\n");
        }
    }

    public int calcularProdutoDiagonalPrincipal(){

        int produto = 1;
        for(int i = 0; i<numeros.length; i++){
            produto *= numeros[i][i];
        }
        return produto;
    }
}
