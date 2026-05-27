import java.util.Scanner;
public class Projeto7 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(java.util.Locale.US);

        double totalFaturamento = 0.0;
        int grandesVendas = 0;
        System.out.println("=== Vendas do mês ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o valor da venda: ");
            double valorVenda = leitor.nextDouble();
            totalFaturamento = totalFaturamento + valorVenda;
            if (valorVenda >= 1000) {
                grandesVendas++;
            }
        }
        System.out.println("Vendas Total: R$ " + totalFaturamento + "Bonificações por ultapassar R$1000,00 em vendas:" + grandesVendas);
        leitor.close();
    }
}