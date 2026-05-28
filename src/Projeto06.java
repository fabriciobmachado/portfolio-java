import java.util.Scanner;

    public class Projeto06 {
        public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);
            
            leitor.useLocale(java.util.Locale.US);

            double totalFaturamento = 0.0; // Nosso porquinho acumulador

            System.out.println("=== Faturamento com Loop FOR ===");

            // -----------------------------------------------------------------
            // SEU DESAFIO AQUI:
            // Monte o loop FOR para começar em 1, ir até menor ou igual a 4, e somar i++
            // -----------------------------------------------------------------
            for ( int i=1 ; i <=4   ; i++  ) {

                System.out.println("Digite o valor da venda: ");
                double valorVenda = leitor.nextDouble();
                totalFaturamento = totalFaturamento + valorVenda ;
                // Coloque aqui a sua lógica do porquinho (acumular o valorVenda no totalFaturamento)

            } // Fim do for

            System.out.println("Faturamento Total: R$ " + totalFaturamento);
            leitor.close();
        }
    }

