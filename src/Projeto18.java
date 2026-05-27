import java.util.Scanner;
import java.util.InputMismatchException; // Import necessário para capturar erro de digitação

public class Projeto18 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("=== Sistema de Cadastro de Usuário ===");

        try {
            System.out.println("Digite a sua idade (apenas números):");

            // -----------------------------------------------------------------
            // SEU DESAFIO PARTE 1:
            // Tente ler a idade do usuário normalmente usando o leitor.nextInt()
            // -----------------------------------------------------------------
            int idade = leitor.nextInt();
            System.out.println("Idade cadastrada com sucesso: " + idade + " anos.");

        } catch (InputMismatchException e) {
            // -----------------------------------------------------------------
            // SEU DESAFIO PARTE 2:
            // Escreva uma mensagem de erro explicando o que o usuário fez de errado
            // -----------------------------------------------------------------
            System.out.println("Erro você precisa digitar um numero inteiro");
        }

        System.out.println("\n[Sistema]: O programa continuou rodando de forma segura e foi finalizado com sucesso!");
        leitor.close();
    }
}