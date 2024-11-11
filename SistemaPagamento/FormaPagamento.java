package Atividade08.SistemaPagamento;

public abstract class FormaPagamento {

    public abstract void processarPagamento(double valor);
    public abstract boolean validarPagamento();
}