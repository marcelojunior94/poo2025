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

    void depositar (double quantidade){
        double novoSaldo = this.saldo + quantidade;
        this.saldo = novoSaldo;
    }

    @Override
    public String toString() {
        return //"Conta{" +
                "\nNumero = " + numero +
                "\nNome = '" + nome + '\'' +
                "\nSaldo = " + saldo +
                "\nLimite = " + limite;
                //'}';
    }
}
