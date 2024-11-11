package Atividade08;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario){
        super(nome,salario);
    }
 
    
    public double calcularBonus() {
        return salario * 0.1; // 10% do salário
    }

    @Override
    public String trabalhar() {
        return "Desenvolvedor programando";
    }
}