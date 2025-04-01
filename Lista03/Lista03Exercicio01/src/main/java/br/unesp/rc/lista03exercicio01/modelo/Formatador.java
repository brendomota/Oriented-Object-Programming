package br.unesp.rc.lista03exercicio01.modelo;

/**
 *
 * @author User
 */
public class Formatador {
    
    private String string;

    public Formatador() {
    }

    public Formatador(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    
    public String formatarABNT(){
        
        String abnt = "";
        
        String tokens[] = string.split(" ");
        
        String sobrenome = tokens[tokens.length - 1];
        for(int i = 0; i < sobrenome.length(); i++){
            char c = Character.toUpperCase(sobrenome.charAt(i));
            abnt += c;
        }
        abnt += ", ";
        
        for(int i = 0; i < tokens.length - 1; i++){
            
            if(tokens[i].startsWith("do") || tokens[i].startsWith("da")){
            }
            else{
                abnt += tokens[i].charAt(0) + ". ";
            }
        }
        
        return abnt;
    }
}
