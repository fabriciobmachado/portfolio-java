public class Projeto51 {
    public static void main(String[] args) {
        System.out.println("=== SIMULANDO GERENCIAMENTO DE BRANCHES ===");

        System.out.println("\n Tronco Principal: branch 'main'");
        System.out.println("⚠️ Aqui fica o código estável que o cliente usa.");

        System.out.println("\n Passo 1: git checkout -b feature-bonus");
        System.out.println("👉 Cria e pula para um galho novo chamado 'feature-bonus'.");
        System.out.println("😎 Agora você pode alterar o código sem medo de quebrar a 'main'!");

        System.out.println("\n Passo 2: Fazer o git add . e git commit");
        System.out.println("👉 Salva as alterações da nova ferramenta apenas dentro do seu galho.");

        System.out.println("\n Passo 3: git checkout main");
        System.out.println("👉 Volta para o tronco principal seguro.");

        // -------------------------------------------------------------
        // SEU DESAFIO:
        // Agora que você voltou para a 'main', você precisa trazer as novidades
        // do galho 'feature-bonus' para dentro dela. O comando para UNIR/MESCLAR
        // duas branches é o 'git _____'. Complete a variável abaixo:
        // -------------------------------------------------------------
        String comandoMesclar = "git merge feature-bonus";

        System.out.println("\n Passo 4: " + comandoMesclar);
        System.out.println("👉 Une o código do galho com o tronco principal de forma segura!");
    }
}