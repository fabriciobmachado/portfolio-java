import java.util.Scanner;

public class Projeto10 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] idadesCatraca = new int[5]; // Array para 5 idades

        System.out.println("=== Monitoramento de Acesso ===");

        // 1. Loop para cadastrar as idades (Preencher o Array)
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            idadesCatraca[i] = leitor.nextInt();
        }

        System.out.println("\n=== Relatório de Acesso ===");

        // 2. Loop para analisar e exibir os acessos
        for (int i = 0; i < 5; i++) {
            if (idadesCatraca [i] < 18)
                System.out.println("Pessoa " + (i + 1) + ": " + idadesCatraca[i] + " anos -> PROIBIDO!");
            else
                System.out.println("Pessoa " + (i + 1) + ": " + idadesCatraca[i] + " anos -> LIBERADO.");

            // -----------------------------------------------------------------
            // SEU DESAFIO AQUI DENTRO:
            // Crie um IF/ELSE para checar a idade que está na gaveta atual: idadesCatraca[i]
            //
            // Se idadesCatraca[i] for menor que 18:
            //    System.out.println("Pessoa " + (i+1) + ": " + idadesCatraca[i] + " anos -> PROIBIDO!");
            // Senão (else):
            //    System.out.println("Pessoa " + (i+1) + ": " + idadesCatraca[i] + " anos -> LIBERADO.");
            // -----------------------------------------------------------------

        }

        leitor.close();
    }
}