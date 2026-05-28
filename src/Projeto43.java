public class Projeto43 {
    public static void main(String[] args) {
        System.out.println("=== CALCULADORA DE PARTICIPAÇÃO DE LUCROS ===");

        double totalLucro = 5000.00;
        int metasAtingidas = 0; // Se for 0, vai dar erro de divisão por zero!

        try {
            System.out.println("Tentando calcular bônus por meta...");

            // Essa linha vai gerar um erro matemático se metasAtingidas for 0
            double resultado = totalLucro / metasAtingidas;

            System.out.println("Bônus por meta atingida: R$ " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Atenção divisão invalida, numero digitado = 0");
            // -------------------------------------------------------------
            // SEU DESAFIO:
            // O Java interceptou o erro matemático! Imprima uma mensagem amigável
            // na tela dizendo que não é possível dividir por zero metas.
            // -------------------------------------------------------------
            // Seu código aqui

        }

        // Se o try-catch funcionar, esta linha ABAIXO vai rodar normalmente!
        // Sem o try-catch, o programa morreria antes de chegar aqui.
        System.out.println("\n=== FIM DO PROGRAMA (O sistema não caiu!) ===");
    }
}