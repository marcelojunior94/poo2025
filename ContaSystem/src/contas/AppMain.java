package contas;
import java.util.Scanner;

public class AppMain {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        Conta conta01 = new Conta();
        Conta conta02 = new Conta();

        // Conta 01
        conta01.nome = "Marcelo";
        conta01.numero = 01;
        conta01.limite = 100000;
        conta01.saldo = 10000;
        System.out.println(conta01.toString());
        System.out.println("\n");

        // Conta 02
        conta02.nome = "Júnior";
        conta02.numero = 02;
        conta02.limite = 85000;
        conta02.saldo = 7000;
        System.out.println(conta02.toString());
        System.out.println("\n");

        // [SACAR]
        System.out.println("======== SAQUE ========");
        System.out.println("\n");
        // [SACAR] CONTA 01
        System.out.println("Quanto gostaria de sacar da conta de " + conta01.nome + "?");
        int valorSaque1 = scanner.nextInt();
        conta01.sacar(valorSaque1);
        System.out.println("O novo valor da conta de " + conta01.nome + " é de R$ " + conta01.saldo);

        // [SACAR] CONTA 02
        System.out.println("Quanto gostaria de sacar da conta de " + conta02.nome + "?");
        int valorSaque2 = scanner.nextInt();
        conta02.sacar(valorSaque2);
        System.out.println("O novo valor na conta de " + conta02.nome + " é de R$ " + conta02.saldo);

        // [DEPOSITAR]
        System.out.println("\n");
        System.out.println("======== DEPÓSITO ========");
        System.out.println("\n");

        // [DEPOSITAR] CONTA 01
        System.out.println("Quanto gostaria de depositar da conta de " + conta01.nome + "?");
        int valorDeposito1 = scanner.nextInt();
        conta01.depositar(valorDeposito1);
        System.out.println("O novo valor da conta de " + conta01.nome + " é de R$ " + conta01.saldo);

        // [DEPOSITAR] CONTA 02
        System.out.println("Quanto gostaria de depositar na conta de " + conta02.nome + "?");
        int valorDeposito2 = scanner.nextInt();
        conta02.depositar(valorDeposito2);
        System.out.println("O novo valor da conta de " + conta02.nome + " é de R$ " + conta02.saldo);

    }
}

