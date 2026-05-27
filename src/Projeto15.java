import java.util.Scanner;

public class Projeto15 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(java.util.Locale.US);

        // Criando a matriz: 2 linhas (Vendedores) e 3 colunas (Meses)
        double[][] vendasMeses = new double[2][3];

        System.out.println("=== Entrada de Dados da Matriz ===");

        // --- VENDEDOR 1 (Linha 0) ---
        System.out.println("Vendedor 1 - Mês 1:");
        vendasMeses[0][0] = leitor.nextDouble();

        System.out.println("Vendedor 1 - Mês 2:");
        vendasMeses[0][1] = leitor.nextDouble();

        System.out.println("Vendedor 1 - Mês 3:");
        vendasMeses[0][2] = leitor.nextDouble();


        // --- VENDEDOR 2 (Linha 1) ---
        System.out.println("Vendedor 2 - Mês 1:");
        vendasMeses[1][0] = leitor.nextDouble();

        System.out.println("Vendedor 2 - Mês 2:");
        vendasMeses[1][1] = leitor.nextDouble(); // Complete aqui

                System.out.println("Vendedor 2 - Mês 3:");
        vendasMeses[1][2] = leitor.nextDouble(); // Complete aqui


                System.out.println("\n=== Exibição dos Dados Gravados ===");

        System.out.println("Vendedor 1 [Mês 1]: R$ " + vendasMeses[0][0]);
        System.out.println("Vendedor 1 [Mês 2]: R$ " + vendasMeses[0][1]);
        System.out.println("Vendedor 1 [Mês 3]: R$ " + vendasMeses[0][2]);

        System.out.println("Vendedor 2 [Mês 1]: R$ " + vendasMeses[1][0]);
        System.out.println("Vendedor 2 [Mês 2]: R$ " + vendasMeses[1][1]);// Complete aqui);
                System.out.println("Vendedor 2 [Mês 3]: R$ " + vendasMeses[1][2]); // Complete aqui);

                        leitor.close();
    }
}