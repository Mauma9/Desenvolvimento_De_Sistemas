package Aula06;

public class PagamentoPix implements MetodoPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Gerando QR Code para Pix no valor de R$ " + valor);
        System.out.println("Pix processado instantaneamente!");
    }

}
