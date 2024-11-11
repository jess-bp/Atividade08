package Atividade08.GestaoFunc;

public class Desenvolvedor extends Funcionario{

    private double bonusFixo;

    public Desenvolvedor(String nome, double salarioBase, double bonusFixo) {
        super(nome, salarioBase);
        this.bonusFixo = bonusFixo;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public double calcularBonus() {
        return bonusFixo;
    }
}