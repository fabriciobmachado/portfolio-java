import java.util.Scanner;

public class Projeto9 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // 1. Criamos um Array de inteiros com 4 posições (gavetas de 0 a 3)
        int[] idades = new int[4];

        System.out.println("=== Cadastro de Idades do RH ===");

        // PRIMEIRO LOOP: Serve para PREENCHER o Array
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a idade do funcionário " + (i + 1) + ":");
              idades[i] = leitor.nextInt();
            // -------------------------------------------------------------
            // SEU DESAFIO PARTE 1:
            // Use o leitor.nextInt() para guardar a idade na gaveta atual [i]
            // -------------------------------------------------------------
            // Seu código aqui = leitor.nextInt();
        }

        System.out.println("\n=== Listando Idades Cadastradas ===");

        // SEGUNDO LOOP: Serve para EXIBIR o que está guardado no Array
        for (int i = 0; i < 4; i++) {

            // -------------------------------------------------------------
            // SEU DESAFIO PARTE 2:
            // Mostre na tela o valor que está na gaveta [i] atual
            // -------------------------------------------------------------
            System.out.println("Funcionário " + (i + 1) + " tem " + (idades[i]) + " anos.");
        }

        leitor.close();
    }
}