import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Seja bem-vindo, por favor digite sua idade:");

        Scanner leitor = new Scanner(System.in);

        // 1. Lemos o teclado UMA ÚNICA VEZ e guardamos na variável
        int idade = leitor.nextInt();

        // 2. Usamos as CHAVES { } para isolar o que acontece se o if for verdadeiro
        // E usamos apenas a variável 'idade' para testar os limites (entre 16 E 100)
        if (idade >= 16 && idade <= 100) {
            System.out.println("SUCESSO: Idade permitida para o cadastro.");
        } else {
            System.out.println("ERRO: Idade inválida para o sistema da empresa.");
        }

        // Boa prática: Fechar o leitor quando terminar de usar
        leitor.close();
    }
}