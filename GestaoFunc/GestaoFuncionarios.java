package Atividade08.GestaoFunc;
import java.util.ArrayList;
import java.util.List;

public class GestaoFuncionarios {

    private List<Funcionario> funcionarios;

    public GestaoFuncionarios() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void calcularFolhaPagamento() {
        double totalSalarios = 0;
        double totalBonus = 0;

        for (Funcionario funcionario : funcionarios) {
            totalSalarios += funcionario.calcularSalario();
            totalBonus += funcionario.calcularBonus();
        }

        System.out.println("Total de Salários: " + totalSalarios);
        System.out.println("Total de Bônus: " + totalBonus);
    }

    public void promoverFuncionario(int index, String novoTipo) {
        if (index < 0 || index >= funcionarios.size()) {
            System.out.println("Funcionário não encontrado.");
            return;
        }

        Funcionario funcionario = funcionarios.get(index);
        String nome = funcionario.getNome();
        double salarioBase = funcionario.getSalarioBase();

        if (novoTipo.equalsIgnoreCase("Gerente")) {
            funcionarios.set(index, new Gerente(nome, salarioBase, 20));
        } else if (novoTipo.equalsIgnoreCase("Desenvolvedor")) {
            funcionarios.set(index, new Desenvolvedor(nome, salarioBase, 500));
        } else if (novoTipo.equalsIgnoreCase("Estagiario")) {
            funcionarios.set(index, new Estagiario(nome, salarioBase, 10));
        } else {
            System.out.println("Tipo de funcionário inválido.");
        }
    }
}