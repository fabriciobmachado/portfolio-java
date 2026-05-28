import java.util.Scanner;

public class Projeto10 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] idadesCatraca = new int[5]; // Array para 5 idades

        System.out.println("=== Monitoramento de Acesso ===");

        // Cadastrar as idades 
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            idadesCatraca[i] = leitor.nextInt();
        }

        System.out.println("\n=== Relatório de Acesso ===");

        // analisar e exibir os acessos
        for (int i = 0; i < 5; i++) {
            if (idadesCatraca [i] < 18)
                System.out.println("Pessoa " + (i + 1) + ": " + idadesCatraca[i] + " anos -> PROIBIDO!");
            else
                System.out.println("Pessoa " + (i + 1) + ": " + idadesCatraca[i] + " anos -> LIBERADO.");

           

        }

        leitor.close();
    }
}
