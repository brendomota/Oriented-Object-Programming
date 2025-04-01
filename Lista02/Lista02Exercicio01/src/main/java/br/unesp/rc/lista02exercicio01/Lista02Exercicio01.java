package br.unesp.rc.lista02exercicio01;

import br.unesp.rc.lista02exercicio01.modelo.Automovel;
import br.unesp.rc.lista02exercicio01.modelo.Caminhao;
import br.unesp.rc.lista02exercicio01.modelo.OrdemServico;
import br.unesp.rc.lista02exercicio01.modelo.Servico;
import br.unesp.rc.lista02exercicio01.modelo.Veiculo;
import br.unesp.rc.lista02exercicio01.repositorio.Oficina;

/**
 *
 * @author User
 */
public class Lista02Exercicio01 {

    public static void main(String[] args) {
        
        Oficina oficina = new Oficina();

        System.out.println("---");
        System.out.println("ATENDIMENTOS");
        System.out.println("---");

        Veiculo veiculo1 = new Automovel(5, "Celta", "LT", 2012);
        Servico servico1 = new Servico(true, false, false);
        OrdemServico ordemServico1 = new OrdemServico(1, veiculo1, servico1);
        oficina.registrarManutencao(ordemServico1);                

        Veiculo veiculo2 = new Automovel(5, "Prisma", "LTZ", 2015);
        Servico servico2 = new Servico(true, false, true);
        OrdemServico ordemServico2 = new OrdemServico(2, veiculo2, servico2);
        oficina.registrarManutencao(ordemServico2);

        Veiculo veiculo3 = new Caminhao(6, "Carreta de três eixos", "Simples", 2020);
        Servico servico3 = new Servico(true, false, false);
        OrdemServico ordemServico3 = new OrdemServico(3, veiculo3, servico3);
        oficina.registrarManutencao(ordemServico3);

        Veiculo veiculo4 = new Caminhao(6, "Carreta de dois eixos", "Luxo", 2022);
        Servico servico4 = new Servico(true, false, true);
        OrdemServico ordemServico4 = new OrdemServico(4, veiculo4, servico4);
        oficina.registrarManutencao(ordemServico4);

        System.out.println("---");
        oficina.imprimirFila();
        System.out.println("---");

        System.out.println("---");
        System.out.println("INICIANDO OS ATENDIMENTOS");
        System.out.println("---");

        while (!oficina.filaVazia()) {
            OrdemServico os = oficina.proximo();
            
            if (os.getServico().isTrocarPneu()) {
                os.getVeiculo().trocarPneu();
            }

            if (os.getServico().isTrocarOleo()) {
                os.getVeiculo().trocarOleo();
            }

            if (os.getServico().isLimparMotor()) {
                os.getVeiculo().limparMotor();
            }
        }
    }
}
