package Aula06.avaliacao;

import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ContarThreads extends Contar {
    public static void main(String[] args) {

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> {
                contarMilhao("Um");
            });

            executor.submit(() -> {
                contarMilhao("Dois");
            });

            executor.submit(() -> {
                contarMilhao("Três");
            });
        }
    }
}

