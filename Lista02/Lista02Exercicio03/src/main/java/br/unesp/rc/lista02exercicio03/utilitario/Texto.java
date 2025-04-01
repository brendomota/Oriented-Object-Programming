package br.unesp.rc.lista02exercicio03.utilitario;

/**
 *
 * @author User
 */
public class Texto {
    
    public static String LINHA = "--------------------------------------------------";

    private Texto() {

    }

    public static void desenharCabecalho(String titulo) {
        System.out.println(String.format("===== [%s] =====", titulo));
    }

    public static void desenharCaixa(String texto) {
        desenharLinha();
        System.out.println(texto);
        desenharLinha();
    }

    public static void desenharLinha() {
        System.out.println(LINHA);
    }
}
