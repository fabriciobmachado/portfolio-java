import java.util.ArrayList;

public class Projeto33 {
    public static void main(String[] args) {
        System.out.println("=== BANCO DE DADOS CORE - RH ===");

        // 1. Criando os funcionários (Objetos) usando o construtor
        //Funcionario f1 = new Funcionario("Carlos", 28, 3500.00);
        //Funcionario f2 = new Funcionario("Ana", 22, 2000.00);

        // 2. Criando o ArrayList que vai guardar objetos do tipo 'Funcionario'
        ArrayList<Funcionario> equipe = new ArrayList<>();

        // 3. Adicionando os objetos dentro da lista
        //equipe.add(f1);
       // equipe.add(f2); // PARTE 1: Ana adicionada com sucesso!

        System.out.println("\n--- Relatório Automatizado da Equipe ---");

        // PARTE 2: O For-Each passa de funcionário em funcionário
        for (Funcionario func : equipe) {
            // Chamamos o método direto da variável temporária 'func'
            func.exibirRelatorio();
        }
    }
}