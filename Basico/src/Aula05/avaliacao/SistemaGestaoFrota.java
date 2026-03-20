package Aula05.avaliacao;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class SistemaGestaoFrota {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in).useLocale(Locale.US);
        var frota = new ArrayList<SistemaGestaoFrota.Veiculo>();


        // Dados iniciais para o sistema não começar vazio
        frota.add(new SistemaGestaoFrota.Veiculo("Triton", 5500.00, "Caminhonete"));
        frota.add(new SistemaGestaoFrota.Veiculo("Scania NTG", 150.00, "Caminhao"));
        frota.add(new SistemaGestaoFrota.Veiculo("Camry", 2500.00, "Sedan"));
        frota.add(new SistemaGestaoFrota.Veiculo("Crx", 45.00, "Hatch"));
        


        var continuar = true;
        while (continuar) {
            var menu = """
                  
                   ======= MENU DE FROTA =======
                   1. Busca por tipo
                   2. Busca por modelo
                   3. Sair
                   Escolha uma opção:\s""";


            System.out.print(menu);
            var opcao = teclado.nextInt();
            teclado.nextLine(); // Limpar o buffer do teclado


            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o tipo: ");
                    var tip = teclado.nextLine();


                    System.out.println("\n--- Resultados ---");
                    frota.stream()
                            .filter(v -> v.tipo().equalsIgnoreCase(tip))
                            .forEach(v -> System.out.printf("- %s: R$ %.2f\n", v.modelo().toUpperCase(), v.valor()));

                }
                case 2 -> {
                    System.out.print("Modelo do Veiculo: ");
                    var modeloBusca = teclado.nextLine();


                    // Uso do Optional com Stream e findFirst
                    var resultado = frota.stream()
                            .filter(v -> v.modelo().equalsIgnoreCase(modeloBusca))
                            .findFirst()
                            .map(v -> "Localizado: " + v.modelo() + " | Preço: R$ " + v.valor())
                            .orElse("Lamento, Veiculo não encontrado.");


                    System.out.println(resultado);
                }
                case 3 -> {
                    System.out.println("Encerrando o sistema... Até logo!");
                    continuar = false;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
        teclado.close();
    }

//agora vai
    public record Veiculo(String modelo, double valor, String tipo) { }
}
