package br.unesp.rc.lista02exercicio01.repositorio;

import br.unesp.rc.lista02exercicio01.modelo.OrdemServico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Oficina {
    
    static List<OrdemServico> fila = new ArrayList<>();
    
    public void registrarManutencao(OrdemServico os){
        fila.add(os);
    }
    
    public OrdemServico proximo(){
        return fila.remove(0);
    }
    
    public boolean filaVazia(){
        return fila.isEmpty();
    }
    
    public void imprimirFila(){
        for(OrdemServico os : fila){
            System.out.println(os);
        }
    }
}
