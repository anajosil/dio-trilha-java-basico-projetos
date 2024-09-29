// import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor, digite o número da sua conta");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome");
        String sobrenome = scanner.next();


        System.out.println("Por favor, digite o saldo");
        double saldo = scanner.nextDouble();


       
        System.out.println("Olá, " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco. A sua agência é " + agencia + ", conta " + conta + ", e seu saldo de " + saldo + " já está disponível para saque.");


    }



}
