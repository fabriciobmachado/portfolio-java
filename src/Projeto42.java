public class Projeto42 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE AUTENTICAÇÃO MULTIUSUÁRIO ===");

        Gerente g1 = new Gerente("Marcos", 42, 8500.00, "Tecnologia");
        Cliente c1 = new Cliente("Amanda");

        System.out.println("\n--- Testando Acesso do Gerente ---");
        // Uma variável do tipo da INTERFACE aceita qualquer classe que assinou o contrato!
        Autenticavel usuarioLogado = g1;
        usuarioLogado.autenticar(1234); // Testa a senha do gerente

        System.out.println("\n--- Testando Acesso do Cliente ---");
        Autenticavel usuarioLogado2 = c1;
        usuarioLogado2.autenticar(2222);
    }
}