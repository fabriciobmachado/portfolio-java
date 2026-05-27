import java.util.Scanner;

public class Projeto5 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int contador = 1;      // Engrenagem: controla as 6 rodadas
        int totalDefeitos = 0; // O Porquinho: conta quantas peças são nota 3

        System.out.println("=== Controle de Qualidade - Lote de 6 Peças ===");

        while (contador <= 6) {
            // 1. Pedimos para digitar DENTRO do loop, a cada rodada
            System.out.println("Digite a nota da peça " + contador + " (1, 2 ou 3):");
            int numerodigitado = leitor.nextInt();

            // 2. SE a nota for igual a 3, aumentamos o porquinho de defeitos
            if (numerodigitado == 3) {
                totalDefeitos++;
            }

            // 3. A engrenagem do loop SEMPRE avança (+1 rodada)
            contador++;
        } // <- AQUI fecha o bloco do while!

        // 4. Só mostramos o resultado FINAL depois que o loop todo acabou
        System.out.println("=== Relatório Final ===");
        System.out.println("Total de peças defeituosas encontradas: " + totalDefeitos);

        leitor.close();
    }
}