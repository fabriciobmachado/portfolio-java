import java.util.Scanner;
import java.util.InputMismatchException;

public class Projeto19 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int idade = 0;
        boolean idadeValida = false; // Nossa bandeira de controle

        System.out.println("=== Cadastro com Validação Contínua ===");

        // O loop vai rodar ENQUANTO a idade NÃO for válida
        while (idadeValida == false) {
            try {
                System.out.println("Digite a sua idade (apenas números):");
                idade = leitor.nextInt();

                // Se o Java chegar nesta linha, significa que a digitação deu certo!
                idadeValida = true; // Muda para true para quebrar o loop while

            } catch (InputMismatchException erro) {
                System.out.println("Erro: Comando inválido! Digite apenas números inteiros.");

                leitor.next(); // IMPORTANTE: Limpa o buffer do scanner (joga fora a letra digitada)
            }
        }

        System.out.println("\nSucesso! Idade final cadastrada: " + idade + " anos.");
        leitor.close();
    }
}