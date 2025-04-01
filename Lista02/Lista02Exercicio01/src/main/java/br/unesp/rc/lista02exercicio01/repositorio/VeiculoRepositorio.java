package br.unesp.rc.lista02exercicio01.repositorio;

import br.unesp.rc.lista02exercicio01.modelo.Veiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class VeiculoRepositorio {
    
    static List<Veiculo> veiculos = new ArrayList<>();

    public VeiculoRepositorio() {
    }

    public static List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public static void setVeiculos(List<Veiculo> veiculos) {
        VeiculoRepositorio.veiculos = veiculos;
    }
    
    public void adicionar(Veiculo veiculo){
        veiculos.add(veiculo);
    }
    
    public void imprimir(){
        for(Veiculo v : veiculos){
            System.out.println(v);
        }
    }
}
