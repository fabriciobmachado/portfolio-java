import java.util.Scanner;
import java.util.InputMismatchException;

public class Projeto44 {
    public static void main(String[] args) {
        System.out.println("=== CALCULADORA DE PARTICIPAÇÃO DE LUCROS ===");

        Scanner teclado = new Scanner(System.in);
        double totalLucro = 5000.00;

        try {
            System.out.print("Digite a quantidade de metas atingidas: ");
            // Se o usuário digitar uma LETRA aqui, o Java pula direto pro catch!
            int metasAtingidas = teclado.nextInt();

            // Para o Java dar erro de divisão por zero real, precisamos forçar a conta com inteiros
            int resultado = (int) totalLucro / metasAtingidas;

            System.out.println("💰 Bônus por meta atingida: R$ " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("❌ Erro: Não é possível dividir o lucro por zero metas!");

        } catch (InputMismatchException e) {
            System.out.println("Atenção somente números inteiros permitidos");

        }

        System.out.println("\n=== FIM DO PROGRAMA (O sistema continuou vivo!) ===");
        teclado.close();
    }
}