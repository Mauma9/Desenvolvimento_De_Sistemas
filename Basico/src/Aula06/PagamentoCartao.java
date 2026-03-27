package Aula06;

public class PagamentoCartao implements MetodoPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Conectando com a operadora de cartão...");
        System.out.println("Pagamento de R$ " + valor + " autorizado com sucesso!");
    }

}
