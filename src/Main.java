import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero, agencia;
        String nome;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.nextInt();

        //Limpa o buffer do scanner para evitar erro de leitura de tipos diferentes
        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial da conta: ");
        saldo = scanner.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nome, saldo);
    }
}