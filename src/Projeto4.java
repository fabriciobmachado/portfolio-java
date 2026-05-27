import java.util.Scanner;

public class Projeto4 {


        public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);

            int contador = 1; // Controla quantas vezes o loop vai rodar
            double totalFaturamento = 50000.0; // Variável ACUMULADORA (começa zerada)

            System.out.println("=== Sistema de Compras Diario ===");

            while (contador <= 5) {
                System.out.println("Seu saldo disponivel hoje é:" + totalFaturamento +"Digite o valor da compra" + contador + ":");
                double valordaCompra = leitor.nextDouble(); // Lê um número quebrado (ex: 50.50)
                totalFaturamento = totalFaturamento - valordaCompra ;
                // -------------------------------------------------------------
                // SEU DESAFIO AQUI DENTRO:
                // Pegue a variável 'totalFaturamento' e acumule o 'valorVenda' nela.
                // -------------------------------------------------------------

                contador++; // Avança o loop
            }

            // Saída do sistema depois que o loop terminar
            System.out.println("Valor total restante: R$ " + totalFaturamento);
            leitor.close();
        }
}
