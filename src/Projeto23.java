public class Projeto23 {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA FISCAL ===");

        // -------------------------------------------------------------
        // SEU DESAFIO PARTE 2: Chame o método calcularImposto 3 vezes,
        // passando valores diferentes (ex: 100.0, 250.50, 1200.0)
        // -------------------------------------------------------------
        calcularImposto(100.0);
        calcularImposto(1450.0);
        calcularImposto(1202500.0);
        // Chame mais duas vezes aqui embaixo com outros valores

    }
    // --- --------------------------------------------------------------
    // SEU DESAFIO PARTE 1: Monte o método calcularImposto aqui.
    // Ele deve receber um double como parâmetro.
    // -----------------------------------------------------------------
    public static void calcularImposto(double valorProduto) {
        double imposto = valorProduto * 0.10; // Calcula 10%
        System.out.println("Produto: R$ " + valorProduto + " | Imposto (10%): R$ " + imposto);
    }
}