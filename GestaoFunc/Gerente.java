package Atividade08.GestaoFunc;

public class Gerente extends Funcionario {
    private double percentualBonus;

    public Gerente(String nome, double salarioBase, double percentualBonus) {
        super(nome, salarioBase);
        this.percentualBonus = percentualBonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * percentualBonus / 100;
    }
}