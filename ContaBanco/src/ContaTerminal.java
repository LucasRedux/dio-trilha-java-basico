import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // conhecer e importar a classe scanner
        // Exibir as mensagens para o nosso usuario
        // Obter pela scanner os valores digitados no terminal
        // exibir a mensagem conta criada
        int Numero;
        String Agencia;
        String NomeCliente;
        Double Saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Por favor, digite o numero da conta:");
        Numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o numero da Agencia:");
        Agencia = scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente:");
        NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o valor a ser sacado:");
        Saldo = scanner.nextDouble();

        System.out.println(" Okay, " + NomeCliente + ", obrigado por criar uma conta em nosso banco, a sua agência é: "
                + Agencia + ", Sua conta é : " + Numero + " e seu saldo no valor de " + Saldo
                + " reais, já está disponivel para saque. ");

        scanner.close();
    }
}
