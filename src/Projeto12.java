import java.util.Scanner;

public class Projeto12 {


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(java.util.Locale.US);

        double[] Valores = new double[4];
        double valortotal = 0.0;
        System.out.println("=== Controle de Gastos ===");


        for (int i = 0; i < 4; i++) {
            System.out.println("Digite Valor do gasto " + (i + 1) + " (em R$):");
            Valores[i] = leitor.nextDouble();
            valortotal = valortotal + Valores[i];
        }


        for (int i = 0; i < 4; i++) {

            System.out.println("Valor"+(i + 1) +  "Valor digitado:" + (Valores[i]));

        }
        System.out.println("VALOR TOTAL GASTO " + valortotal);

        leitor.close();
    }
}

