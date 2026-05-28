
public class Projeto03 {
    public static void main(String[] args) {

        System.out.println("=== Relatório de Transações NUMEROS INTEIROS DIVISIVEIS POR 3 ===");

        int id = 1; // Começa no ID 1

        while (id <=60 ) {

            
            if (id % 3 == 0) {
                System.out.println("Transação PAR encontrada - ID: " + id);
            }

            
            id++;
        }

    }
}



