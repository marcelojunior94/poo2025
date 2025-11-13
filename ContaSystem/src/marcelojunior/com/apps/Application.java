package marcelojunior.com.apps;

import java.util.Scanner;
import marcelojunior.com.contas.Conta;
import marcelojunior.com.contas.ContaEspecial;
import marcelojunior.com.contas.ContaInvestimento;
import marcelojunior.com.contas.ContaJunior;

public class Application {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        ContaEspecial contEsp01 = new ContaEspecial(1, "Junior",1000);
        ContaInvestimento contInvest01 = new ContaInvestimento(1,"Marcelo",0.02,30);


        contInvest01.saldo = 1000;
        contInvest01.aplicarRendimento(0.02);



//
//        System.out.println("=====SAQUE=====");
//        System.out.printf("Seu saldo atual é de: R$ %.2f\n", conta01.saldo);
//        System.out.println("Quanto você quer sacar?");
//        conta01.sacar(scanner.nextDouble());
//        System.out.printf("Saldo: R$ %.2f\n", conta01.saldo);
//
//        System.out.println("=====DEPÓSITO=====");
//        System.out.printf("Seu saldo atual é de: R$ %.2f\n", conta01.saldo);
//        System.out.println("Quanto você quer depositar?");
//        conta01.depositar(scanner.nextDouble());
//        System.out.printf("Saldo: R$ %.2f\n", conta01.saldo);


    }
}

