// Repare: SEM 'extends', apenas 'implements'!
public class Cliente implements Autenticavel {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    // Cumprindo o mesmo contrato da interface!
    @Override
    public boolean autenticar(int senhaDigitada) {
        // A senha do cliente vai ser fixa em 4321
        if (senhaDigitada == 4321) {
            System.out.println("🛍️ Portal do Cliente: Bem-vindo, " + this.nome + "!");
            return true;
        } else {
            System.out.println("❌ Senha do Cliente Inválida!");
            return false;
        }
    }
}