package aula02.Funcionario;

import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Funcionario f1 = new Funcionario();//Criando o objeto

        System.out.println("### CADASTRO DE FUNCIONÁRIO ###");

        System.out.print("Nome: ");
        f1.nome = teclado.nextLine();//Lendo String

        System.out.print("Salário Bruto: ");
        f1.salarioBruto = teclado.nextDouble();//Lendo double

        System.out.print("Porcentagem do Desconto (0-100): ");
        f1.porcentagemDesconto = teclado.nextDouble();

        //Processando e exibindo
        f1.imprimirContracheque();
    }
}
