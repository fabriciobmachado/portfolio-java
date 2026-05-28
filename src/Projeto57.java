public class Projeto57 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE RECURSOS HUMANOS ===");

        // Adicionado "Vendas" como o departamento do Gerente
        Gerente gerente = new Gerente("Fabrício Brum", 30, 6000.00, "Vendas");
        gerente.calcularBonus();

        System.out.println("\n-----------------------------------\n");

        // Adicionado "Diretoria Geral" como o departamento do Diretor
        Diretor diretor = new Diretor("Machado", 45, 12000.00);
        diretor.calcularBonus();
    }
}