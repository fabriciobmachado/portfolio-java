import java.util.Scanner;

public class Projeto16 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(java.util.Locale.US);

        double[][] vendasMeses = new double[2][3];

        System.out.println("=== Entrada de Dados Automatizada ===");

        // 1. LOOP DUPLO PARA CADASTRAR
        for (int l = 0; l < 2; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Digite as vendas do Vendedor " + (l + 1) + " no Mês " + (c + 1) + ":");
                vendasMeses[l][c] = leitor.nextDouble();
                // -------------------------------------------------------------
                // SEU DESAFIO PARTE 1:
                // Guarde o dado do scanner na posição dinâmica da matriz [l][c]
                // -------------------------------------------------------------
                // Seu código aqui = leitor.nextDouble();
            }
        }

        System.out.println("\n=== Relatório de Vendas (Matriz) ===");

        // 2. LOOP DUPLO PARA EXIBIR
        for (int l = 0; l < 2; l++) {
            for (int c = 0; c < 3; c++) {

                // -------------------------------------------------------------
                // SEU DESAFIO PARTE 2:
                // Printe na tela indicando o vendedor, o mês e o valor contido na matriz
                // -------------------------------------------------------------
                System.out.println("Vendedor " + (l + 1) + " [Mês " + (c + 1) + "]: R$ " + vendasMeses[l][c]);
            }
        }

        leitor.close();
    }
}