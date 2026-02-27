package aula02.Funcionario;

public class Funcionario {
    String nome;
    double salarioBruto;
    double porcentagemDesconto;
    double desconto;

    public double calcularSalarioLiquido() {
        this.desconto = this.porcentagemDesconto/100 * this.salarioBruto;
        return this.salarioBruto - this.desconto;
    }
    public void imprimirContracheque() {
        System.out.println("\n --- CONTRACHEQUE ---");
        System.out.println("Funcionário: " + this.nome);
        System.out.println("Salário Líquido: " + calcularSalarioLiquido());
        System.out.println("Salário Bruto: " + this.salarioBruto);
        System.out.println("Desconto: " + this.porcentagemDesconto + "% - R$ " + this.desconto);

    }
}
