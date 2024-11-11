package Atividade08.SistemaPagamento;

public class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " processado com boleto.");
        } else {
            System.out.println("Pagamento com boleto inválido.");
        }
    }

    @Override
    public boolean validarPagamento() {
        // Lógica de validação do boleto (exemplo simplificado)
        return codigoBarras.length() == 44; // Exemplo de tamanho do código de barras
    }
}