package br.unesp.rc.lista01exercicio04.modelo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author User
 */
public class Vetor {
    
    private static final int MAIOR_NUMERO_GERADO = 100;
    private int[] numeros;

    public Vetor() {
    }

    public Vetor(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
            
    public void gerarVetor(){
        
        numeros = new int[10];
        
        Random rand = new Random();
        
        for(int i = 0; i < 10; i++){
            numeros[i] = rand.nextInt(MAIOR_NUMERO_GERADO + 1);
        }
    }
    
    public void imprimir(){
        for(int i = 0; i<numeros.length; i++){
            System.out.printf("%d ", numeros[i]);
        }
    }
    
    public int[] retirarNulosNegativos(){
        
        int tamanho = 0;
        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] <= 0){
                tamanho++;
            }
        }
        
        int j = 0;
        int aux[] = new int[tamanho];
        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] <= 0){
                aux[j] = numeros[i];
                j++;
            }
        }
        return aux;
    }
    
}
