import java.util.Scanner;

public class Projeto11 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(java.util.Locale.US);

        double[] pesos = new double[4]; // Array para 4 caixas

        System.out.println("=== Balança da Expedição ===");

        // 1. Loop para cadastrar os pesos
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o peso da caixa " + (i + 1) + " (em kg):");
            pesos[i] = leitor.nextDouble();
        }

        // 2. Criamos a variável que vai rastrear o maior peso. 
        // Começamos assumindo que a primeira caixa (gaveta 0) é a maior.
        double maiorPeso = pesos[0];
        for (int i = 1; i < 4; i++) {

            if (pesos[i] > maiorPeso) {
                maiorPeso = pesos[i];
            }
        }

        double menorpeso = pesos[0];
        for (int i = 1; i < 4; i++) {

            if (pesos[i] < menorpeso) {
                menorpeso = pesos[i];
            }
        }

        for (int i = 0; i < 4; i++) {

        System.out.println("Pesos digitados: " + (i + 1)+ "Pesos digitados:" + (pesos[i]));

        }
        System.out.println("\n=== Relatório de Logística ===");
        System.out.println("O maior peso registrado no lote foi: " + maiorPeso + " kg.");
        System.out.println("O menor peso registrado no lote foi: " + menorpeso + " kg.");

        leitor.close();
    }
}