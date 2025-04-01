package br.unesp.rc.lista01exercicio06.modelo;

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
    
    public void imprimir(){
        for(int i = 0; i<numeros.length; i++){
            for(int j = 0; j<numeros[i].length; j++){
                if(numeros[i][j] < 10){
                    System.out.printf("%d    ", numeros[i][j]);
                }
                else{
                    System.out.printf("%d   ", numeros[i][j]);
                }                  
            }
            System.out.printf("\n");
        }
    }
    
    public void gerarMatriz(int tamanho){
        
        numeros = new int[tamanho][tamanho];
        Random rand = new Random();
        
        for(int i = 0; i<numeros.length; i++){
            for(int j = 0; j<numeros[i].length; j++){
                numeros[i][j] = rand.nextInt(MAX_VALOR_GERADO + 1);
            }
        }
    }
    
    public void gerarVetorMaiorElementoLinhas(int[] vetor){
        
        vetor = new int[numeros.length];
        
        for(int i = 0; i<numeros.length; i++){
            
            int maior_elemento = -1;
            for(int j = 0; j<numeros[i].length; j++){
                if(numeros[i][j] > maior_elemento){
                    maior_elemento = numeros[i][j];
                }
            }
            vetor[i] = maior_elemento;
        }
        System.out.printf("\nVetor: ");
        for(int i = 0; i<vetor.length; i++){
            System.out.printf("%d ", vetor[i]);
        }
    }
    
    public void gerarVetorMenorElementoColunas(int[] vetor){
        
        vetor = new int[numeros.length];
        
        for(int i = 0; i<numeros.length; i++){
            int menor_elemento = 1000;
            for(int j = 0; j<numeros[i].length; j++){
                if(numeros[j][i] < menor_elemento){
                    menor_elemento = numeros[j][i];
                }
            }
            vetor[i] = menor_elemento;
        }
        System.out.printf("\nVetor: ");
        for(int i = 0; i<vetor.length; i++){
            System.out.printf("%d ", vetor[i]);
        }
    }
}
