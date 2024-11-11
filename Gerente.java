package Atividade08;

public class Gerente extends Funcionario{

public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double calcularBonus() {
        return salario * 0.2; // 20% do salário
    }

    @Override
    public String trabalhar() {
        return "Gerente gerenciando";
    }
}