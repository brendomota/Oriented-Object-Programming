package br.unesp.rc.lista02exercicio01.modelo;

/**
 *
 * @author User
 */
public class Automovel extends Veiculo{
    
    private int numeroPassageiros;

    public Automovel() {
    }

    public Automovel(int numeroPassageiros, String nome, String modelo, int ano) {
        super(nome, modelo, ano);
        this.numeroPassageiros = numeroPassageiros;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    @Override
    public void trocarPneu() {
        System.out.printf("  Trocando pneu do automovel %s %s (%d)\n", getNome(), getModelo(), getAno());
    }

    @Override
    public void trocarOleo() {
        System.out.printf("  Trocando óleo do automovel %s %s (%d)\n", getNome(), getModelo(), getAno());
    }

    @Override
    public void limparMotor() {
        System.out.printf("  Limpando motor do automovel %s %s (%d)\n", getNome(), getModelo(), getAno());
    }

    @Override
    public String toString() {
        return "Automovel{" + "numeroPassageiros=" + numeroPassageiros + ", " + super.toString() + '}';
    }
}
