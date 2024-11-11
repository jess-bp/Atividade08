package Atividade08.SistemaPagamento;

public class Pix extends FormaPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " processado com Pix.");
        } else {
            System.out.println("Pagamento com Pix inválido.");
        }
    }

    @Override
    public boolean validarPagamento() {
        // Lógica de validação do Pix (exemplo simplificado)
        return chavePix != null && !chavePix.isEmpty();
    }
}