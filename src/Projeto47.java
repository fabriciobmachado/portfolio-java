import java.util.Scanner;

public class Projeto47 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA COM CONEXÃO DE BANCO DE DADOS ===");
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("\n[CONEXÃO] Conectando ao Banco de Dados da Empresa...");
            System.out.println("[CONEXÃO] Banco de Dados Aberto e Pronto!");

            System.out.print("Digite um número para dividir 100: ");
            int numero = teclado.nextInt();

            int resultado = 100 / numero;
            System.out.println("Resultando da divisão: " + resultado);

        } catch (Exception e) {
            System.out.println("❌ Erro detectado no sistema: " + e.getMessage());

        } finally {
            // -------------------------------------------------------------
            // ESTE BLOCO SEMPRE EXECUTA!
            // -------------------------------------------------------------
            System.out.println("\n[FINALLY] Limpando recursos do sistema...");
            System.out.println("[FINALLY] Conexão com o Banco de Dados FECHADA com segurança!");
            teclado.close();
        }

        System.out.println("\n=== FIM DO PROCESSO ===");
    }
}