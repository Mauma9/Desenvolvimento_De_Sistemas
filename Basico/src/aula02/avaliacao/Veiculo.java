package aula02.avaliacao;

public class Veiculo {
    //atributos
    String modelo;
    double precoDiaria;
    int quantidadeDeDias;
    double totalAluguel;

    public void calcularTotal(){
        this.totalAluguel = precoDiaria * quantidadeDeDias;
    }

    public void gerarRecibo(){
        System.out.printf("Modelo: " + modelo);
        System.out.printf("\nPreço da diária: " + precoDiaria);
        System.out.printf("\nQuantidade de dias: " + quantidadeDeDias);
        calcularTotal();
        System.out.printf("\nTotal aluguel: R$ %.2f" , totalAluguel);
    }
}
