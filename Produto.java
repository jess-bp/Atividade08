package Atividade08;
public class Produto{

    public String nome;
    public double preco;
    public int quantidade;

public Produto(String nome, double preco, int quantidade){
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;

}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public double getPreco() {
    return preco;
}

public void setPreco(double preco) {
    if (preco < 0) {
        throw new IllegalArgumentException("Preço inválido! Não pode ser negativo");
    }
    this.preco = preco;
}

public int getQuantidade() {
    return quantidade;
}

public void setQuantidade(int quantidade) {
    if (quantidade < 0) {
        throw new IllegalArgumentException("Quantidade inválida! Não pode ser negativa");
    }   
    this.quantidade = quantidade;
}

public void aplicarDesconto(double porcentagem){
    
    if (porcentagem < 0 || porcentagem > 50){
        throw new IllegalArgumentException("Porcentagem inválida! Deve ser entre 0 e 50");
    }
    double desconto = preco * porcentagem / 50;
    preco -= desconto;
}

//Método para exibir informações do produto
public void exibirInfo(){
    System.out.println("Nome: " + nome);
    System.out.println("Preço: R$" + String.format("%.2f", preco));
    System.out.println("Quantidade em estoque: " + quantidade);
}
}