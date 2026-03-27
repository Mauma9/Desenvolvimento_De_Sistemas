package Aula06;

import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class CheckoutLoja {
    private final MetodoPagamento metodo;


    public CheckoutLoja(MetodoPagamento metodo) {
        this.metodo = metodo;
    }


    public void executar(double valor) {
        metodo.processar(valor);
    }


    public static void main(String[] args) {
        // Exemplo: Injetando o Contrato de Pix
        var pix = new CheckoutLoja(new PagamentoPix());
        var cartao = new CheckoutLoja(new PagamentoCartao());


        // Usando o Executor de Virtual Threads do Java 25
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 30).forEach(i -> {
                executor.submit(() -> {
                    if (i % 2 == 0) {
                        pix.executar(100.0 + i);
                    } else{
                        cartao.executar(100.0 - i);
                    }
                });
            });
        }
        System.out.println("Processamento concluído em Threads Virtuais!");
    }

}
