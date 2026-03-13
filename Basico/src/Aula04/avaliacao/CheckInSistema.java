package Aula04.avaliacao;

import java.util.Random;
import java.util.Scanner;

public class CheckInSistema {
    public record Passagem(String passageiro, String destino, String assento, String beneficio){}
    public static void main(String[] args) {
        //Declaracao de variaveis
        Scanner teclado = new Scanner(System.in);
        String passageiro;
        String destino;
        String assentoSorteado;
        int classeVoo;
        Random gerador = new Random();
        Passagem bilhete;

        //Entrada de dados
        System.out.println("Digite o passageiro: ");
        passageiro = teclado.nextLine();

        System.out.println("Digite o destino: ");
        destino = teclado.nextLine();

        System.out.println("Digite a classe do voo (1- Econômica, 2- Executiva, 3- Primeira classe: ");
        classeVoo = teclado.nextInt();

        //Processamento
        String[] fileiras = new String[]{"A", "B", "C", "D", "E", "F"};
        int numero = gerador.nextInt(32) + 1;
        char letraAssento = fileiras[ gerador.nextInt(fileiras.length)].charAt(0);
        assentoSorteado = "%02d%c".formatted(numero, letraAssento);
        String beneficio = switch (classeVoo){
           case 1 -> "Lanche e Refri";
           case 2 -> "Jantar VIP e Wi-Fi";
           case 3 -> "Suíte e Degustação";
           default -> "Nenhum";
        };

        bilhete = new Passagem(passageiro, destino, assentoSorteado ,beneficio);
        //saida
        String saida = """
                __________________________________________________
                |                                                                                                  |
                |            CARTÃO DE EMBARQUE - JAVA 25                           |
                |_________________________________________________|
                | PASSAGEIRO:    %-35s|                                                          |
                | DESTINO:       %-35s|                                                                         |
                | ASSENTO:       %-35s|                                                                        |
                | BENEFÍCIO:     %-35s|                                                                        |
                |_________________________________________________
                
                """.formatted(
                bilhete.passageiro(),
                bilhete.destino(),
                bilhete.assento(),
                bilhete.beneficio()
                );
        System.out.println(saida);
    }
}
