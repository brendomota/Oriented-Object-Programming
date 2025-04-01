package br.unesp.rc.lista01exercicio05.utilitario;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Teclado {
    
    Scanner scanner = new Scanner(System.in);

    public Teclado() {
    }
    
    public int lerInt(){
        int numero;
        numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }
}
