import java.util.Scanner;
import java.util.InputMismatchException;

public class Projeto46 {
    public static void main(String[] args) {
        System.out.println("=== CALCULADORA INFINITA DE LUCROS ===");

        Scanner teclado = new Scanner(System.in);
        double totalLucro = 5000.00;

        // Esta variável controla se o usuário pode ou não sair do loop
        boolean sucesso = false;

        while (!sucesso) { // Tradução: "Enquanto NÃO tiver sucesso, repita..."
            try {
                System.out.print("\nDigite a quantidade de metas atingidas: ");
                int metasAtingidas = teclado.nextInt();

                // Nossa regra de negócio do Dia 45
                if (metasAtingidas < 0) {
                    throw new RegraNegocioException("Quantidade de metas não pode ser negativa!");
                }

                // O Java lança ArithmeticException se for 0
                int resultado = (int) totalLucro / metasAtingidas;
                System.out.println("💰 Bônus por meta: R$ " + resultado);

                // Se o código chegou ATÉ AQUI sem dar nenhum erro, comemore!
                sucesso = true; // Isso quebra o while e encerra o programa

            } catch (RegraNegocioException e) {
                System.out.println("❌ Erro de Negócio: " + e.getMessage());
                // Como 'sucesso' continua false, o loop roda de novo!

            } catch (ArithmeticException e) {
                System.out.println("❌ Erro: Divisão por zero inválida!");

            } catch (InputMismatchException e) {
                System.out.println("❌ Erro: Digite apenas números inteiros!");
                teclado.nextLine(); // Limpa o buffer do teclado (Evita o loop infinito de erro!)
            }
        }

        System.out.println("\n=== FIM DO PROGRAMA: Obrigado por acertar! ===");
        teclado.close();
    }
}