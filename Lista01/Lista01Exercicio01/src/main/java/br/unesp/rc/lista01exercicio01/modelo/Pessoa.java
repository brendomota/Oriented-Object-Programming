package br.unesp.rc.lista01exercicio01.modelo;

/**
 *
 * @author User
 */
public class Pessoa {
    
    private String nome;
    private long cpf;
    private double salario;

    public Pessoa() {
    }

    public Pessoa(String nome, long cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + '}';
    }
    
    public double calcularImposto(){
        
        double taxa;
        
        if(salario <= 1500){
            taxa = 0;
        }
        else if(salario > 1500 && salario <= 2000){
            taxa = 0.075;
        }
        else if(salario > 2000 && salario <= 3000){
            taxa = 0.15;
        }
        else if(salario > 3000 && salario <= 4000){
            taxa = 0.225;
        }
        else{
            taxa = 0.275;
        }
        
        double imposto = (double) taxa*salario;
        
        return imposto;
    }
    
}
