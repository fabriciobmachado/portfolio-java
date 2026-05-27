import java.util.Scanner;
import java.util.InputMismatchException;

public class Projeto21 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] nomes = new String[3];
        int[] idades = new int[3];

        System.out.println("=== SISTEMA DE CADASTRO BLINDADO ===");

        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Cadastrando o Funcionário " + (i + 1) + " ---");

            // ==========================================
            // VALIDAÇÃO DO NOME (Rejeita números)
            // ==========================================
            boolean nomeValido = false;
            while (nomeValido == false) {
                System.out.print("Digite o Nome: ");
                String nomeDigitado = leitor.next();

                // Testar se o nome contém APENAS letras
                if (nomeDigitado.matches("[a-zA-ZÀ-ÿ]+")) {
                    nomes[i] = nomeDigitado; // Grava no array
                    nomeValido = true;       // Sai do loop do nome
                } else {
                    System.out.println("⚠️ Erro: O nome deve conter apenas letras! Tente novamente.");
                }
            }

            // ==========================================
            // VALIDAÇÃO DA IDADE (Rejeita letras)
            // ==========================================
            boolean idadeValida = false;
            while (idadeValida == false) {
                try {
                    System.out.print("Digite a Idade de " + nomes[i] + ": ");
                    idades[i] = leitor.nextInt();

                    idadeValida = true; // Se chegou aqui, deu certo e sai do loop

                } catch (InputMismatchException erro) {
                    System.out.println("⚠️ Erro: Idade inválida! Digite apenas números inteiros.");
                    leitor.next(); // Limpa o buffer do teclado
                }
            }
        }

        System.out.println("\n=== RELATÓRIO FINAL DE CADASTROS ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("Funcionário: " + nomes[i] + " | Idade: " + idades[i] + " anos");
        }

        leitor.close();
    }
}