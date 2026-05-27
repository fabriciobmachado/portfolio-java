public class Projeto25 {

    public static void main(String[] args) {
        System.out.println("=== ANALISADOR DE FOLHA DE PAGAMENTO ===");

        // Vetor contendo o salário de 4 funcionários
        double[] listaSalarios = {3500.0, 4200.0, 2800.0, 5500.0};

        // Chamamos o método passando o nosso vetor inteirinho para ele
        double mediaDaEmpresa = calcularMedia(listaSalarios);

        System.out.println("A média salarial da empresa é: R$ " + mediaDaEmpresa);
    }

    // Método que recebe o array, calcula e RETORNA a média
    public static double calcularMedia(double[] salarios) {
        double soma = 0.0;

        // 1. O loop percorre o array e acumula os valores na 'soma'
        for (int i = 0; i < salarios.length; i++) {
            soma += salarios[i];
        }

        // 2. Calcula a média dividindo o total pelo número de funcionários
        double resultadoMedia = soma / salarios.length;

        // 3. Retorna o resultado final de volta para o main
        return resultadoMedia;
    }
}