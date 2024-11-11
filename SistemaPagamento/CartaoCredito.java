package Atividade08.SistemaPagamento;

public class CartaoCredito extends FormaPagamento {

    private String numeroCartao;
    private String dataValidade;
    private String codigoSeguranca;

    public CartaoCredito(String numeroCartao, String dataValidade, String codigoSeguranca) {
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " processado com cartão de crédito.");
        } else {
            System.out.println("Pagamento com cartão de crédito inválido.");
        }
    }

    @Override
    public boolean validarPagamento() {
        // Lógica de validação do cartão de crédito (exemplo simplificado)
        return numeroCartao.length() == 16 && !dataValidade.isEmpty() && !codigoSeguranca.isEmpty();
    }
}