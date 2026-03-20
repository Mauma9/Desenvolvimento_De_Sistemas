package Aula05;

import java.util.HashMap;

public class ExHashMap {
    public static void main(String[] args) {
        // Map<Chave, Valor> -> Chave é o Bilhete, Valor é o Nome do Passageiro
        var mapaVoo = new HashMap<String, String>();


        // Inserindo dados (put)
        mapaVoo.put("TK-123", "Rodrigo Faro");
        mapaVoo.put("AZ-987", "Marta Vieira");
        mapaVoo.put("GL-456", "Neymar Junior");


        // Buscando um valor pela chave (Muito rápido!)
        var busca = "AZ-987";
        System.out.println("Bilhete " + busca + " pertence a: " + mapaVoo.get(busca));


        // Verificando se uma chave existe
        if (mapaVoo.containsKey("TK-123")) {
            System.out.println("Passageiro confirmado no sistema.");
        }
    }
}
