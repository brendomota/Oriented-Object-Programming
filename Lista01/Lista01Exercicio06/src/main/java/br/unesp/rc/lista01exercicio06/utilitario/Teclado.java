package br.unesp.rc.lista01exercicio06.utilitario;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Teclado {
    
    Scanner scanner = new Scanner(System.in);
    
    public int lerInt(){
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }
}
