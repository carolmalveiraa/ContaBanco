import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite a Agência");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + " e o número da sua conta é " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();

    }
}
