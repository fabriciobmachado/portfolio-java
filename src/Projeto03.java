
public class Projeto03 {
    public static void main(String[] args) {

        System.out.println("=== Relatório de Transações NUMEROS INTEIROS DIVISIVEIS POR 3 ===");

        int id = 1; // Começa no ID 1

        while (id <=60 ) {

            // Se o ID for par, nós imprimimos ele
            if (id % 3 == 0) {
                System.out.println("Transação PAR encontrada - ID: " + id);
            }

            // O id++ fica AQUI, no final do while, livre.
            // Ele vai somar +1 SEMPRE, não importa se o número foi par ou ímpar.
            id++;
        }

    }
}



