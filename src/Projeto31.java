import java.util.ArrayList; // IMPORTANTE: O Java precisa importar essa ferramenta!

public class Projeto31 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE FLUXO SALARIAL DINÂMICO ===");

        // Criando um ArrayList dinâmico de Double
        ArrayList<Double> listaSalarios = new ArrayList<>();

        // Adicionando elementos usando o .add()
        listaSalarios.add(2500.0);
        listaSalarios.add(4200.50);
        listaSalarios.add(5600.00);



        System.out.println("\n--- Salários Cadastrados ---");

        // O loop vai rodar até o tamanho atual da lista (.size())
        for (int i = 0; i < listaSalarios.size(); i++) {

            // ---------------------------------------------------------
            // SEU DESAFIO PARTE 2:
            // Use o método .get(i) para pegar o salário da posição atual
            // e exibir dentro do println abaixo.
            // ---------------------------------------------------------
            System.out.println("Salário [" + i + "]: R$ " + listaSalarios.get(i));
        }
    }
}