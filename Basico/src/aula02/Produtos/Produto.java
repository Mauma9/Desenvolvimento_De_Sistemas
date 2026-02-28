package aula02.Produtos;

public class Produto {
    //Atributos
    String nome;
    double precoUnitario;
    int quantidade;

    public double calcularTotalEstoque(){
        return precoUnitario * quantidade;
    }
}
