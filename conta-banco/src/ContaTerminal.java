import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da conta:");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a Agência:");
        agencia = sc.nextLine();
        System.out.println("Digite o nome do cliente:");
        nomeCliente = sc.nextLine();
        System.out.println("Digite o saldo:");
        saldo = sc.nextDouble();
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
        sc.close();
    }
}
