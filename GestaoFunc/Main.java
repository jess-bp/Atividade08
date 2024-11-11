package Atividade08.GestaoFunc;

public class Main {
    public static void main(String[] args) {
        GestaoFuncionarios gestao = new GestaoFuncionarios();

        // Adicionando funcionários
        gestao.adicionarFuncionario(new Gerente("Alice", 5000, 10));
        gestao.adicionarFuncionario(new Desenvolvedor("Bob", 4000, 300));
        gestao.adicionarFuncionario(new Estagiario("Charlie", 2000, 5));

        // Calculando folha de pagamento
        gestao.calcularFolhaPagamento();

        // Promovendo um funcionário
        System.out.println("\nPromovendo Bob para Gerente...");
        gestao.promoverFuncionario(1, "Gerente");

        // Calculando folha de pagamento após promoção
        gestao.calcularFolhaPagamento();
    }
}