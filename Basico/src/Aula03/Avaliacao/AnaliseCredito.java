package Aula03.Avaliacao;

import java.util.Scanner;

public class AnaliseCredito {
    public static void main(String[] args) {
        //declaração de variaveis
        int quantidadeClientes;
        String nome = "";
        double rendaMensal;
        int tempoEmprego;
        String credito = "";

        Scanner teclado = new Scanner(System.in);
        //entrada
        System.out.println("Quantos clientes estão na fila? ");
        quantidadeClientes = teclado.nextInt();

        //limpa o buffer
        teclado.nextLine();

        for (int i = 1; i <= quantidadeClientes; i++) {

            System.out.println("Digite o nome do cliente: ");
            nome = teclado.nextLine();



            System.out.println("Digite o renda mensal: ");
            rendaMensal = teclado.nextDouble();

            //limpa o buffer
            teclado.nextLine();

            System.out.println("Digite o tempo de emprego: ");
            tempoEmprego = teclado.nextInt();

            if (rendaMensal > 10000 && tempoEmprego >= 12) {
                credito = "Crédito VIP";
            } else if (rendaMensal >= 3000
                    && rendaMensal <= 10000
                    && tempoEmprego > 24) {
                credito = "Crédito Básico";
            } else {
                credito = "Crédito Negado";
            }

            //limpa o buffer
            teclado.nextLine();

            //saída
            System.out.println("==============================");
            System.out.println("O Cliente: " + nome.toUpperCase());
            System.out.println(" Renda: " + rendaMensal);
            System.out.println("Tempo de trabalho: " + tempoEmprego);
            System.out.println("Credito: " + credito);
            System.out.println("==============================");
        }
    }
}
