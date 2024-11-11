package Atividade08.GestaoFunc;

public class Estagiario extends Funcionario {
    
    private final double percentualBonus;

    public Estagiario(String nome, double salarioBase, double percentualBonus) {
        super(nome, salarioBase);
        this.percentualBonus = percentualBonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 0.5; // Estagiários recebem metade do salário base
    }

    @Override
    public double calcularBonus() {
        return calcularSalario() * percentualBonus / 100;
    }
}