package aula02.Produtos;

import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner teclado = new Scanner(System.in);

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        //Cadastro Produto 1
        System.out.println("Digite o nome do produto 1: ");
        p1.nome = teclado.nextLine();

        System.out.println("Digite o preço do produto 1: ");
        p1.precoUnitario = teclado.nextDouble();

        System.out.println("Digite o quantidade do produto 1: ");
        p1.quantidade = teclado.nextInt();

        //limpa o buffer
        teclado.nextLine();

        //Cadastro Produto 2
        System.out.println("Digite o nome do produto 2 :");
        p2.nome = teclado.nextLine();

        System.out.println("Digite o preço do produto 2 :");
        p2.precoUnitario = teclado.nextDouble();

        System.out.println("Digite a quantidade do produto 2 :");
        p2.quantidade = teclado.nextInt();


        if (p1.calcularTotalEstoque() > p2.calcularTotalEstoque()){
            System.out.println("O " + p1.nome + " tem o maior valor!");
        }else {
            System.out.println("O " + p2.nome + " tem o maior valor!");
        }
    }
}
