package Aula04;

import java.util.Scanner;

public class Modernidade {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);

        System.out.println("=== CADASTRO MODERNO JAVA 25 ===");
        System.out.println("Nome do Colaborador: ");
        var nomeInput = teclado.nextLine();

        System.out.println("Salário Base: ");
        var salarioInput = teclado.nextDouble();

        System.out.println("CArgo (DEV, DESIGNER, MANAGER): ");
        var  cargoInput = teclado.next().toUpperCase();

        //1. criando o record (imutabilidade e segurança)
        var funcionario = new Colaborador(nomeInput, salarioInput, cargoInput);

        //2. switch expression para calcular bônus retornando valor[
        var bonus = switch (funcionario.cargo()){
            case "DEV" -> funcionario.salario() * 0.20;
            case "DESIGNER" -> funcionario.salario() * 0.15;
            case "MANAGER" -> funcionario.salario() * 0.25;
            default -> 0.0;
        };

        //text bloc para gerar o contracheque elegante
        var recibo = """
                ---------------------------------------
                RECIBO DE PAGAMENTO - MÓDULO 2
                ---------------------------------------
                COLABORADOR: %s
                CARGO:       %s
                SALÁRIO:     %.2f
                BÔNUS:       %.2f
                TOTAL:       %.2f
                ---------------------------------------
                """.formatted(
                funcionario.nome(),
                funcionario.cargo(),
                funcionario.salario(),
                bonus,
                (funcionario.salario() + bonus)
        );
        System.out.println(recibo);
        teclado.close();
    }
    //definindo o record como transportador de dados imutável
    public record Colaborador(String nome, double salario, String cargo){
    }
}
