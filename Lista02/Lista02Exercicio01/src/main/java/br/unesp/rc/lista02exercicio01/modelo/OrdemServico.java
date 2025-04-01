package br.unesp.rc.lista02exercicio01.modelo;

/**
 *
 * @author User
 */
public class OrdemServico {
    
    private int idOrdemServico;
    private Veiculo veiculo;
    private Servico servico;

    public OrdemServico() {
    }

    public OrdemServico(int idOrdemServico, Veiculo veiculo, Servico servico) {
        this.idOrdemServico = idOrdemServico;
        this.veiculo = veiculo;
        this.servico = servico;
    }

    public int getIdOrdemServico() {
        return idOrdemServico;
    }

    public void setIdOrdemServico(int idOrdemServico) {
        this.idOrdemServico = idOrdemServico;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    @Override
    public String toString() {
        return "OrdemServico{" + "idOrdemServico=" + idOrdemServico + ", veiculo=" + veiculo + ", servico=" + servico + '}';
    }
    
    
}
