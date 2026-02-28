package aula02.avaliacao;

import java.util.Locale;
import java.util.Scanner;

public class SistemaLocacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Veiculo veiculo1 = new Veiculo();

        teclado.useLocale(Locale.US);

        System.out.println("Digite o modelo do carro: ");
        veiculo1.modelo = teclado.nextLine();

        System.out.println("Valor da diária: ");
        veiculo1.precoDiaria = teclado.nextDouble();

        System.out.println("Quantidade de dias: ");
        veiculo1.quantidadeDeDias = teclado.nextInt();

        teclado.close();

        veiculo1.gerarRecibo();
    }
}
