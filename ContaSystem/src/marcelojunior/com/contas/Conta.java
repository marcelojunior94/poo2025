package marcelojunior.com.contas;

public class Conta {
    public int numero;
    public String nome;
    public double saldo;

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0;
    }

//    public Conta(){
//        System.out.println("Criando uma estrutura de conta vazia!");
//    }

    public boolean sacar(double quantidade) {
        if (this.saldo > 0) {
            if (saldo < quantidade) {
                System.out.println("Você não tem saldo suficiente para sacar essa quantia.");
                return false;
            } else {
                double novoSaldo = this.saldo - quantidade;
                this.saldo = novoSaldo;
                return true;
            }
        } else {
            System.out.println("Você não tem saldo");
            return false;
        }

    }


    public boolean depositar(double quantidade){
        if (quantidade > 0) {
            double novoSaldo = this.saldo + quantidade;
            this.saldo = novoSaldo;
            return true;
        } else {
            System.out.println("Você digitou uma quantidade inválida.");
            return false;
        }

    }

//
//    @Override
//    public String toString() {
//        return "Conta: " +
//                "\nNome: " + nome +
//                "\nNúmero da conta: " + numero +
//                "\nSaldo: " + saldo;
//    }
}

