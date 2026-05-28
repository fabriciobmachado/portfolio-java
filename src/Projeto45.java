import java.util.Scanner;

public class Projeto45 {
    public static void main(String[] args) {
        System.out.println("=== CALCULADORA DE LUCROS PREMIUM ===");

        Scanner teclado = new Scanner(System.in);
        double totalLucro = 5000.00;

        try {
            System.out.print("Digite a quantidade de metas atingidas: ");
            int metasAtingidas = teclado.nextInt();

            // Validação da nossa regra de negócio
            if (metasAtingidas < 0) {
                // Dispara o nosso erro customizado na hora e pula pro catch!
                throw new RegraNegocioException("Quantidade de metas não pode ser negativa!");
            }

            int resultado = (int) totalLucro / metasAtingidas;
            System.out.println("💰 Bônus por meta: R$ " + resultado);

        } catch (RegraNegocioException e) {
            // Pegamos a mensagem que escrevemos lá no 'throw new' usando e.getMessage()
            System.out.println("❌ Erro de Negócio: " + e.getMessage());

        } catch (Exception e) {
            // Um catch genérico caso aconteça qualquer outra coisa (tipo o zero)
            System.out.println("❌ Erro inesperado: " + e.getMessage());
        }

        System.out.println("\n=== FIM DO PROGRAMA ===");
        teclado.close();
    }
}