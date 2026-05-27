// Gerente herda de Funcionario e assina o contrato de Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

    private String departamento;

    // Construtor repassando os dados do Pai via super()
    public Gerente(String nome, int idade, double salario, String departamento) {
        super(nome, idade, salario);
        this.departamento = departamento;
    }

    // Sobrescrita do relatório para embutir o departamento de forma automática
    @Override
    public void exibirRelatorio() {
        super.exibirRelatorio();
        System.out.println("\n-> [Status: Gestor do Departamento de " + this.departamento + "]");
    }

    // Cumprindo a obrigação do bônus estipulada pelo Pai
    @Override
    public void calcularBonus() {
        double bonusGerente = 2000.00;
        System.out.println("Bônus de Chefia Calculado: R$ " + bonusGerente);
    }

    // Cumprindo o contrato de login da Interface Autenticavel
    @Override
    public boolean autenticar(int senhaDigitada) {
        if (senhaDigitada == 1234) {
            System.out.println("🔐 Acesso Concedido ao Sistema!");
            return true;
        } else {
            System.out.println("❌ Senha Inválida!");
            return false;
        }
    }
}