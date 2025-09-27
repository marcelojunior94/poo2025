package contas;

public class AppMain {
    public static void main(String[] args) {
        Conta conta01 = new Conta();
        Conta qualquerNome = new Conta();

        //conta01
        conta01.nome = "Marcelo";
        conta01.limite = 5000;
        conta01.numero = 152596753;
        conta01.saldo = 10000;

        //qualquerNome
        qualquerNome.nome = "Júnior";
        qualquerNome.limite = 2500;
        qualquerNome.numero = 753951456;
        qualquerNome.saldo = 5000;

        System.out.println("Nome: " + conta01.nome + "\nLimite: "  + "R$ " + conta01.limite + "\nNúmero da conta: " + conta01.numero + "\nSaldo: " + conta01.saldo + " R$");
        System.out.println("\n\nNome: " + qualquerNome.nome + "\nLimite: " + "R$ " + qualquerNome.limite + "\nNúmero da conta: " + qualquerNome.numero + "\nSaldo: " + qualquerNome.saldo + " R$");

        //System.out.println(conta01);
    }
}
