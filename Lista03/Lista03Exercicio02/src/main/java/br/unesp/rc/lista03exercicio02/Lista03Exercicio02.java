package br.unesp.rc.lista03exercicio02;

/**
 *
 * @author User
 */
public class Lista03Exercicio02 {

    public static void main(String[] args) {
        
        String originalPassword = "senha1234";
        int codec = 1; // 1 para codificar, 0 para decodificar

        String encodedPassword = mod1(originalPassword, codec);
        encodedPassword = mod2(encodedPassword, codec);
        encodedPassword = mod3(encodedPassword, codec);

        System.out.println("Encoded Password: " + encodedPassword);

        // Decodificação
        codec = 0; // Mudando para decodificação
        String decodedPassword = mod3(encodedPassword, codec);
        decodedPassword = mod2(decodedPassword, codec);
        decodedPassword = mod1(decodedPassword, codec);

        System.out.println("Decoded Password: " + decodedPassword);
    }
    
    public static String mod1(String password, int codec) {
        if (codec == 1) { // Codificação
            return new StringBuilder(password).reverse().toString();
        } else { // Decodificação
            return new StringBuilder(password).reverse().toString();
        }
    }

    /**
     * Realiza a modificação 2 na senha.
     * Aqui, vamos usar uma transformação simples de caracteres (substituição).
     */
    public static String mod2(String password, int codec) {
        if (codec == 1) { // Codificação
            return transformCharacters(password, true);
        } else { // Decodificação
            return transformCharacters(password, false);
        }
    }

    /**
     * Realiza a transformação dos caracteres da senha.
     * A codificação desloca os caracteres em +3 e a decodificação em -3.
     */
    private static String transformCharacters(String password, boolean encode) {
        StringBuilder transformed = new StringBuilder();
        int shift = encode ? 3 : -3;
        for (char c : password.toCharArray()) {
            transformed.append((char) (c + shift));
        }
        return transformed.toString();
    }

    /**
     * Realiza a modificação 3 na senha.
     * Aqui, vamos adicionar um prefixo e sufixo fixo.
     */
    public static String mod3(String password, int codec) {
        if (codec == 1) { // Codificação
            return "prefix" + password + "suffix";
        } else { // Decodificação
            if (password.startsWith("prefix") && password.endsWith("suffix")) {
                return password.substring(6, password.length() - 6);
            } else {
                throw new IllegalArgumentException("Invalid encoded password format.");
            }
        }
    }
}
