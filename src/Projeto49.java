public class Projeto49 {
    public static void main(String[] args) {
        System.out.println("=== SIMULADOR DE COMANDOS SQL (MERCADO) ===");

        // 1. Comando para criar a tabela no banco de dados
        String sqlCriarTabela = "CREATE TABLE funcionarios (id INT, nome VARCHAR(100), salario DECIMAL);";

        System.out.println("\n[SQL] Executando comando de estrutura:");
        System.out.println(sqlCriarTabela);
        System.out.println("👉 Tabela 'funcionarios' gerada com sucesso no banco!");

        // 2. Comando para inserir um funcionário (A regra do SQL é usar aspas simples para texto)
        String sqlInserirMarcos = "INSERT INTO funcionarios (id, nome, salario) VALUES (1, 'Marcos', 8500.00);";

        System.out.println("\n[SQL] Inserindo dados do Gerente:");
        System.out.println(sqlInserirMarcos);


        // -------------------------------------------------------------
        // SEU DESAFIO:
        // Crie uma String chamada 'sqlInserirAmanda' simulando o comando SQL
        // para inserir a Amanda na tabela. O ID dela deve ser 2 e o salário 5000.00.
        // Dica: Siga o exato modelo da linha do Marcos ali de cima!
        // -------------------------------------------------------------
        // Seu código aqui (String sqlInserirAmanda = ... ;)
        String sqlInserirAmanda = "INSERT INTO funcionarios (id, nome, salario) VALUES (2, 'Amanda', 5000.00);";

        System.out.println("\n[SQL] Inserindo dados do Cliente/Funcionário:");
        System.out.println(sqlInserirAmanda);
        // Imprima aqui a sua variável 'sqlInserirAmanda' para ver se o comando ficou correto

        System.out.println("\n✅ Dados persistidos mentalmente! Amanhã prepare-se para o Git.");
    }
}