package br.unesp.rc.lista01exercicio03.modelo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author User
 */
public class Vetor {
    
    private static final int MAIOR_ELEMENTO_GERADO = 100;
    private int numeros[];

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
    
    public void gerarElementos(int tamanho){
        numeros = new int[tamanho];
        Random rand = new Random();
        for(int i = 0; i<numeros.length; i++){
            numeros[i] = rand.nextInt(MAIOR_ELEMENTO_GERADO + 1);
        }
    }
    
    public void imprimirVetor(){
        System.out.println("Vetor: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.printf("%d ", numeros[i]);
        }
    }
    
    public int somarElementos(){
        
        int total = 0;
        for(int i = 0; i<numeros.length; i++){
            total += numeros[i];
        }
        return (int)total;
    }
    
    public int[] ordenarCrescente(){
        
        int copy[] = new int[numeros.length];
        
        copy = Arrays.copyOf(numeros, numeros.length);
        
        Arrays.sort(copy);
        
        return copy;
    }
    
    public int calcularMaiorElementos(){
        int maior = -1;
        
        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }
        return maior;
    }
}
