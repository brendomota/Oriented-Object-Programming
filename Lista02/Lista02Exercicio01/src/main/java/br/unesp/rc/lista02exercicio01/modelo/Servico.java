package br.unesp.rc.lista02exercicio01.modelo;

/**
 *
 * @author User
 */
public class Servico {
    
    private boolean trocarPneu;
    private boolean trocarOleo;
    private boolean limparMotor;

    public Servico() {
    }

    public Servico(boolean trocarPneu, boolean trocarOleo, boolean limparMotor) {
        this.trocarPneu = trocarPneu;
        this.trocarOleo = trocarOleo;
        this.limparMotor = limparMotor;
    }

    public boolean isTrocarPneu() {
        return trocarPneu;
    }

    public void setTrocarPneu(boolean trocarPneu) {
        this.trocarPneu = trocarPneu;
    }

    public boolean isTrocarOleo() {
        return trocarOleo;
    }

    public void setTrocarOleo(boolean trocarOleo) {
        this.trocarOleo = trocarOleo;
    }

    public boolean isLimparMotor() {
        return limparMotor;
    }

    public void setLimparMotor(boolean limparMotor) {
        this.limparMotor = limparMotor;
    }

    @Override
    public String toString() {
        return "Servico{" + "trocarPneu=" + trocarPneu + ", trocarOleo=" + trocarOleo + ", limparMotor=" + limparMotor + '}';
    }
    
    
}
