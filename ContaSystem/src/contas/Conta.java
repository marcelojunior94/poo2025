package contas;

public class Conta {
    int numero;
    String nome;
    double saldo;
    double limite;

    void sacar(double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    @Override
    public String toString() {
        return "Conta: " +
                "\nNome: " + nome +
                "\nNúmero da conta: " + numero +
                "\nSaldo: " + saldo +
                "\nLimite: " + limite;
    }

    void depositar(double quantidade){
        double novoSaldo = this.saldo + quantidade;
        this.saldo = novoSaldo;
    }
}
