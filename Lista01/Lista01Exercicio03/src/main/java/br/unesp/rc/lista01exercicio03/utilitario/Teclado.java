package br.unesp.rc.lista01exercicio03.utilitario;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Teclado {
    
    private static Scanner scanner = new Scanner(System.in);

    public Teclado() {
    }
            
    public static int lerInt(){
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }
}
