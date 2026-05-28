import java.util.ArrayList;

public class Projeto34 {
    public static void main(String[] args) {
        System.out.println("=== ATUALIZAÇÃO DE QUADRO DE FUNCIONÁRIOS ===");

        //Funcionario f1 = new Funcionario("Carlos", 28, 3500.00);
        //Funcionario f2 = new Funcionario("Ana", 22, 2000.00);

        ArrayList<Funcionario> equipe = new ArrayList<>();
        //equipe.add(f1); // Posição [0]
        //equipe.add(f2); // Posição [1]

        System.out.println("Total de funcionários antes: " + equipe.size());
        //equipe.remove(f2);
        // -------------------------------------------------------------
        // SEU DESAFIO:
        // Use o método .remove() para deletar a Ana da lista 'equipe'
        // através do número do índice dela.
        // -------------------------------------------------------------
        // Seu código aqui ( dica: equipe.remove(...); )


        System.out.println("Total de funcionários depois: " + equipe.size());

        System.out.println("\n--- Funcionários Restantes ---");
        for (Funcionario func : equipe) {
            func.exibirRelatorio(); // Deve mostrar apenas o Carlos!
        }
    }
}