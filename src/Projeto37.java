import java.util.ArrayList;

public class Projeto37 {
    public static void main(String[] args) {
        System.out.println("=== FOLHA DE PAGAMENTO UNIFICADA (POLIMORFISMO) ===");

        // 1. Criando um funcionário comum e um gerente
       // Funcionario f1 = new Funcionario("Carlos", 28, 3500.00);
        Gerente g1 = new Gerente("Marcos", 42, 8500.00, "Tecnologia");

        // 2. Criando a lista do tipo PAI (Funcionario)
        ArrayList<Funcionario> listaEmpresa = new ArrayList<>();

        // 3. Adicionando o funcionário comum
        //listaEmpresa.add(f1);
       // listaEmpresa.add(g1);


        System.out.println("\n--- Rodando Relatório de Toda a Empresa ---");

        // 4. O loop passa tratando todo mundo como 'Funcionario'
        for (Funcionario func : listaEmpresa) {
        func.exibirRelatorio();

        }
    }
}