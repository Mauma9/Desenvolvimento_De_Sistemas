package Aula05;

import java.util.List;

public class ExStream {
    public static void main(String[] args) {
        var todosVoos = List.of(
                new Voo("1010", "CANCELADO"),
                new Voo("2020", "CONFIRMADO"),
                new Voo("3030", "EMBARCANDO")
        );


        var buscaNumero = "4040"; // Voo que não existe na lista


        // Pipeline de Stream
        var statusFinal = todosVoos.stream()
                .filter(v -> v.numero().equals(buscaNumero)) // Tenta filtrar o voo
                .map(v -> v.status().toLowerCase())           // Se achar, transforma status em minúsculo
                .findFirst()                                  // Retorna um Optional<String>
                .orElse("Voo não localizado ou inexistente"); // Se estiver vazio, usa este valor padrão


        System.out.println("Resultado da Consulta: " + statusFinal);


        // Exemplo encontrando um voo:
        var outroNumero = "2020";
        var statusVooExistente = todosVoos.stream()
                .filter(v -> v.numero().equals(outroNumero))
                .map(Voo::status)
                .findFirst()
                .orElse("Inexistente");


        System.out.println("Voo 2020: " + statusVooExistente);
    }


    public record Voo(String numero, String status) { }

}
