public class Projeto24 {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE FOLHA DE PAGAMENTO ===");

        double salarioBase = 3000.00;
        // -----------------------------------------------------------------
        // SEU DESAFIO PARTE 2: Chamando o método com retorno.
        // O valor que o método devolver (o bônus) será guardado nesta variável:
        // -----------------------------------------------------------------
        double valorDoBonus = calcularBonus(salarioBase);

        // Agora conseguimos fazer contas com o resultado do método!
        double salarioTotal = salarioBase + valorDoBonus;

        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.println("Bônus Recebido: R$ " + valorDoBonus);
        System.out.println("Total a Pagar: R$ " + salarioTotal);
    }

    // -----------------------------------------------------------------
    // SEU DESAFIO PARTE 1: Monte o método com RETORNO aqui embaixo.
    // Repare que trocamos o 'void' por 'double'.
    // -----------------------------------------------------------------
    public static double calcularBonus(double salario) {
        double bonus = salario * 0.15; // Calcula 15%

        // -------------------------------------------------------------
        // Use a palavra 'return' para enviar a variável 'bonus' de volta
        // -------------------------------------------------------------
        return bonus; // Escreva o comando de retorno aqui
    }
}