public abstract class Funcionario {
   
    private String nome;
    private int idade;
    private double salario;

    
    public Funcionario() {
    }

    
    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

   
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

    
    public void exibirRelatorio() {
        System.out.print("Colaborador: " + this.nome + " | Salário: R$ " + this.salario + " | Idade: " + this.idade + " anos ");
    }

    
    public abstract void calcularBonus();
}
