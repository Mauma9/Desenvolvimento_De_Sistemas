package Aula03;

import java.util.Scanner;

public class SistemaIntegrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu = 0;

        //While: Mantém o programa rodando até o usuário sair
        while (menu != 3) {
            System.out.println("\n--- SISTEMA INTEGRADADO v1.0 (JAVA 25)---");
            System.out.println("1. Validar Acesso (IF/ELSE)");
            System.out.println("2. Rodar Teste de Carga (FOR)");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            menu = teclado.nextInt();

            //SWITCH: Gerencia as opções do menu
            switch (menu) {
                case 1 -> {
                    System.out.println("Informe a idade do usuário: ");
                    int idade = teclado.nextInt();

                    //IF/ELSE: Lógica de Decisão
                    if (idade >= 18){
                        System.out.println("ACESSO TOTAL LIBERADO.");
                    } else if (idade >= 16) {
                        System.out.println("ACESSO RESTRITO (APENAS CONSULTA).");
                    } else {
                        System.out.println("ACESSO NEGADO.");
                    }
                }
                case 2 -> {
                    System.out.println("Quantos ciclos de teste deseja rodar?");
                    int ciclos = teclado.nextInt();

                    //FOR: Repetição controlada
                    for (int i = 1; i <= ciclos; i++) {
                        System.out.println("executando o ciclo #" + i + " ... OK");
                    }
                }
                case 3 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção Inválida! Tente novamente");
            }
        }
        teclado.close();
    }
}
