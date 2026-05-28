public class Diretor extends Funcionario {

    // Construtor ajustado para o padrão do seu Funcionario (com idade!)
    public Diretor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public void calcularBonus() {
        // Agora o Java vai encontrar o getSalario() que você acabou de criar no Pai!
        double salarioBase = super.getSalario();
        double bonusDirecao = 5000.00;
        double totalBonus = salarioBase + bonusDirecao;

        System.out.println("Bônus de Direção Calculado: R$ " + totalBonus);
    }

}