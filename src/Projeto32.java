import java.util.ArrayList;

public class Projeto32 {
    public static void main(String[] args) {
        System.out.println("=== INVENTÁRIO DE ESTOQUE ===");

        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("Parafusadeira DeWalt");
        produtos.add("Furadeira Makita");
        produtos.add("Churrasqueira elétrica");
        // -------------------------------------------------------------
        // SEU DESAFIO PARTE 1:
        // Adicione um terceiro produto de sua escolha na lista (.add)
        // -------------------------------------------------------------
        // Seu código aqui


        System.out.println("\n--- Produtos em Estoque ---");

        // -------------------------------------------------------------
        // SEU DESAFIO PARTE 2:
        // Monte o loop For-Each aqui embaixo para varrer a lista 'produtos'.
        // Dica: Como a lista é de String, a variável temporária deve ser String!
        // -------------------------------------------------------------
        for (String p : produtos) {
            System.out.println(p);
        }// Complete a estrutura aqui ) {

        // Dê um print na variável temporária 'p' aqui dentro

    }
}
