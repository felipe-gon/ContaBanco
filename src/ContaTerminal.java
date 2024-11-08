import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in).useDelimiter("\\n").useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta !");
        int numero = SC.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = SC.next();

        System.out.println("Por favor, digite o seu nome !");
        String nomeCliente = SC.next();

        System.out.println("Por favor, digite o seu saldo !");
        double saldo = SC.nextDouble();

        System.out.println("Olá " +nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+ ", conta "+numero+" e seu saldo "+ saldo+ " já está disponível para saque");

        }
    }