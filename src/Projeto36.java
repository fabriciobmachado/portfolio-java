public class Projeto36 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CARGOS - HERANÇA ===");

        // Criando um gerente com Nome, Idade, Salário e Departamento
        Gerente g1 = new Gerente("Marcos", 42, 8500.00, "Tecnologia");

        System.out.println("\n--- Dados do Gestor ---");
        g1.exibirRelatorio();


    }
}