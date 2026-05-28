public class Projeto39 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE BONIFICAÇÃO ===");

        // Criando o gerente normalmente
        Gerente g1 = new Gerente("Marcos", 42, 8500.00, "Tecnologia");

        System.out.println("\n--- Processando Folha de Pagamento ---");
        g1.exibirRelatorio();
        g1.calcularBonus();
        // -------------------------------------------------------------
        // SEU DESAFIO:
        // Faça o gerente 'g1' chamar o seu novo método '.calcularBonus()'
        // -------------------------------------------------------------
        // Seu código aqui

    }
}