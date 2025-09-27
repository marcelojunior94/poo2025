package contas;

public class AppMain {
    public static void main(String[] args) {
        Conta conta01 = new Conta();
        Conta conta02 = new Conta();

        //conta01
        conta01.nome = "Marcelo";
        conta01.limite = 5000;
        conta01.numero = 152596753;
        conta01.saldo = 10000;

        //conta02
        conta02.nome = "Júnior";
        conta02.limite = 2500;
        conta02.numero = 753951456;
        conta02.saldo = 5000;

        System.out.println("Saldo antigo: ");
        System.out.println("Conta 01: " + conta01.saldo);
        System.out.println("Conta 02: " + conta02.saldo);

        conta01.sacar(1000);
        conta02.sacar(500);
        System.out.println("\nSaldo novo pós saque: ");
        System.out.println("Conta 01: " + conta01.saldo);
        System.out.println("Conta 02: " + conta02.saldo);

        conta01.depositar(300);
        conta02.depositar(255);
        System.out.println("\nSaldo novo pós depósito: ");
        System.out.println("Conta 01: " + conta01.saldo);
        System.out.println("Conta 02: " + conta02.saldo);


        //System.out.println("Nome: " + conta01.nome + "\nLimite: "  + "R$ " + conta01.limite + "\nNúmero da conta: " + conta01.numero + "\nSaldo: " + "R$ " + conta01.saldo);
        //System.out.println("\n\nNome: " + conta02.nome + "\nLimite: " + "R$ " + conta02.limite + "\nNúmero da conta: " + conta02.numero + "\nSaldo: " + "R$ "+ conta02.saldo);

        //System.out.println(conta01);
    }
}
