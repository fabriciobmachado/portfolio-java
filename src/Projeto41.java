public class Projeto41 {
    public static void main(String[] args) {
        System.out.println("=== PORTAL DE ACESSO - RH ===");

        Gerente g1 = new Gerente("Marcos", 42, 8500.00, "Tecnologia");

        System.out.println("\n--- Tentativa de Login ---");
        g1.autenticar(9999);// -------------------------------------------------------------


    }
}