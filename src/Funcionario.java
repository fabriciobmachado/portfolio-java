public abstract class Funcionario {
    // Atributos privados protegidos
    private String nome;
    private int idade;
    private double salario;

    // Construtor Coringa
    public Funcionario() {
    }

    // Construtor Completo
    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setIdade(int novaIdade) {
        if (novaIdade > 0 && novaIdade < 120) {
            this.idade = novaIdade;
        } else {
            System.out.println("⚠️ Erro: Idade inválida!");
        }
    }

    // Método de ação padrão
    public void exibirRelatorio() {
        System.out.print("Colaborador: " + this.nome + " | Salário: R$ " + this.salario + " | Idade: " + this.idade + " anos ");
    }

    // MÉTODO ABSTRATO: Sem corpo {}, obriga os filhos a criarem suas regras de bônus
    public abstract void calcularBonus();
}