package Aula05;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ExGestaoEstoque {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in).useLocale(Locale.US);
        var estoque = new ArrayList<Produto>();


        // Dados iniciais para o sistema não começar vazio
        estoque.add(new Produto("iPhone 15", 5500.00, "ELETRONICOS"));
        estoque.add(new Produto("Mouse Gamer", 150.00, "PERIFERICOS"));
        estoque.add(new Produto("Monitor 4K", 2500.00, "ELETRONICOS"));
        estoque.add(new Produto("Cabo HDMI", 45.00, "ACESSORIOS"));
        estoque.add(new Produto("Teclado Mecânico", 350.00, "PERIFERICOS"));


        var continuar = true;
        while (continuar) {
            var menu = """
                  
                   ======= MENU DE ESTOQUE =======
                   1. Listar por Categoria (> R$ 100)
                   2. Buscar Produto por Nome
                   3. Adicionar Novo Produto
                   4. Sair
                   Escolha uma opção:\s""";


            System.out.print(menu);
            var opcao = teclado.nextInt();
            teclado.nextLine(); // Limpar o buffer do teclado


            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite a categoria: ");
                    var cat = teclado.nextLine();


                    System.out.println("\n--- Resultados ---");
                    estoque.stream()
                            .filter(p -> p.categoria().equalsIgnoreCase(cat))
                            .filter(p -> p.preco() > 100.0)
                            .forEach(p -> System.out.printf("- %s: R$ %.2f\n", p.nome(), p.preco()));
                }
                case 2 -> {
                    System.out.print("Nome do produto: ");
                    var nomeBusca = teclado.nextLine();


                    // Uso do Optional com Stream e findFirst
                    var resultado = estoque.stream()
                            .filter(p -> p.nome().equalsIgnoreCase(nomeBusca))
                            .findFirst()
                            .map(p -> "Localizado: " + p.nome() + " | Preço: R$ " + p.preco())
                            .orElse("Lamento, produto fora de estoque.");


                    System.out.println(resultado);
                }
                case 3 -> {
                    System.out.print("Nome: ");
                    var n = teclado.nextLine();
                    System.out.print("Preço: ");
                    var p = teclado.nextDouble();
                    teclado.nextLine(); // Limpar buffer
                    System.out.print("Categoria: ");
                    var c = teclado.nextLine();


                    estoque.add(new Produto(n, p, c));
                    System.out.println("Produto cadastrado com sucesso!");
                }
                case 4 -> {
                    System.out.println("Encerrando o sistema... Até logo!");
                    continuar = false;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
        teclado.close();
    }


    public record Produto(String nome, double preco, String categoria) { }

}
