import java.util.Scanner;
import java.util.InputMismatchException;

public class Projeto20 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // Criamos dois vetores de tamanho 3 (um para textos, outro para números)
        String[] nomes = new String[3];
        int[] idades = new int[3];

        System.out.println("=== SISTEMA DE CADASTRO DE FUNCIONÁRIOS ===");

        // Loop principal: passa de funcionário em funcionário
        for (int i = 0; i < 3; i++) {

            System.out.println("\n--- Cadastrando o Funcionário " + (i + 1) +":");

            boolean nomevalido = false;
            while (nomevalido == false) {
                try {

                    System.out.println("Digite seu nome:" );
                    nomes[i] = leitor.next();
                    // Se o Java chegar nesta linha, significa que a digitação deu certo!
                    nomevalido = true; // Muda para true para quebrar o loop while

                } catch (InputMismatchException erro) {
                    System.out.println("Erro: numeros não permitidos");
                    // -----------------------------------------------------------------
                    // SEU DESAFIO: Monte a estrutura do WHILE e do TRY-CATCH aqui dentro.
                    // O sistema deve insistir na pergunta abaixo até que a idade seja válida.
                    // -----------------------------------------------------------------
                    leitor.next();
                }
            }

                    boolean idadeValida = false;

                    while (idadeValida == false) {
                        try {
                            System.out.print("Digite a Idade de " + nomes[i] + ": ");
                            idades[i] = leitor.nextInt(); // Tenta ler a idade

                            // Se der certo, mude a variável para sair do while
                            idadeValida = true;

                        } catch (InputMismatchException erro2) {
                            System.out.println("⚠️ Erro: Idade inválida! Digite apenas números.");
                            leitor.next(); // Limpa o buffer do teclado
                        }
                    }
                }

                System.out.println("\n=== RELATÓRIO FINAL DE CADASTROS ===");
                // Loop para exibir os dados lado a lado
                for (int i =1; i < 3; i++) {
                    System.out.println("Funcionário: " + nomes[i] + " | Idade: " + idades[i] + " anos");
                }

                leitor.close();

        }
    }