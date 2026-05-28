import java.util.ArrayList;

public class Projeto35 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE RESCISÃO DE CONTRATO ===");

       // Funcionario f1 = new Funcionario("Carlos", 28, 3500.00);
        //Funcionario f2 = new Funcionario("Ana", 22, 2000.00);

        ArrayList<Funcionario> equipe = new ArrayList<>();
       // equipe.add(f1); // Índice 0
       // equipe.add(f2); // Índice 1

        System.out.println("\n--- Gerando Dados do Colaborador Desligado ---");

        // 1. Buscamos especificamente quem está no índice 1 (Ana)
        Funcionario colaboradorSaindo = equipe.get(1);

        // 2. Mandamos EXCLUSIVAMENTE a Ana se exibir antes de sair
        colaboradorSaindo.exibirRelatorio();

        // 3. Agora sim, removemos a Ana do banco de dados
        equipe.remove(1);

        System.out.println("\n--- Homologação Concluída ---");
        System.out.println("Funcionários ativos na empresa agora: " + equipe.size());
    }
}