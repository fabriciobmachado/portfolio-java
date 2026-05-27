import java.util.Scanner;

public class Projeto8 { // Só mudei o nome para Projeto8 para combinar com o dia!
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(java.util.Locale.US);

        // 1. Criando o Array para guardar 3 preços
        double[] precos = new double[3];

        System.out.println("=== Cadastro de Preços ===");

        // Primeiro exibe o texto...
        System.out.println("Digite o preço do Produto 1:");
        // ...depois o Scanner lê do teclado e guarda na gaveta 0!
        precos[0] = leitor.nextDouble();

        System.out.println("Digite o preço do Produto 2:");
        precos[1] = leitor.nextDouble();

        System.out.println("Digite o preço do Produto 3:");
        precos[2] = leitor.nextDouble();

        System.out.println("\n=== Lista de Preços Salvos ===");

        // Mostrando os valores reais que o usuário digitou
        System.out.println("Produto 1: R$ " + precos[0]);
        System.out.println("Produto 2: R$ " + precos[1]);
        System.out.println("Produto 3: R$ " + precos[2]);

        leitor.close();
    }
}