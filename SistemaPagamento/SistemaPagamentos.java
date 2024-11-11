package Atividade08.SistemaPagamento;

public class SistemaPagamentos {
    public static void main(String[] args) {
        FormaPagamento cartao = new CartaoCredito("1234567812345678", "12/25", "123");
        FormaPagamento boleto = new Boleto("12345678901234567890123456789012345678901234");
        FormaPagamento pix = new Pix("chave@pix.com");

        cartao.processarPagamento(150.00);
        boleto.processarPagamento(75.50);
        pix.processarPagamento(200.00);
    }
}