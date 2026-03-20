package Aula05;

import java.util.ArrayList;

public class ExArrayList {
    public static void main(String[] args) {
        // Criando a lista dinâmica com var
        var listaDeEmbarque = new ArrayList<Passageiro>();
        // Adicionando elementos
        listaDeEmbarque.add(new Passageiro("Ricardo Silva", "12A"));
        listaDeEmbarque.add(new Passageiro("Ana Souza", "05C"));
        listaDeEmbarque.add(new Passageiro("Carlos Oliveira", "22F"));


        // Acessando por índice
        System.out.println("Primeiro da fila: " + listaDeEmbarque.get(0).nome() + "/" + listaDeEmbarque.get(0).assento());


        // Removendo alguém que desistiu do voo
        listaDeEmbarque.remove(1); // Remove a Ana Souza


        System.out.println("Total de passageiros após desistência: " + listaDeEmbarque.size());
    }


    public record Passageiro(String nome, String assento) {
    }

}
