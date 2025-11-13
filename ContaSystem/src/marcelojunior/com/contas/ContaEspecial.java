package marcelojunior.com.contas;

public class ContaEspecial extends Conta {
    public double limite;


    public ContaEspecial(int numero, String nome, double limite) {
        super(numero, nome);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double quantidade) {
        if (this.saldo > 0) {
            if (saldo < quantidade) {
                System.out.println("Você não tem saldo suficiente para sacar essa quantia.");
                return false;
            } else {
                double novoSaldo = this.saldo - quantidade;
                this.depositar(0.9999 * quantidade);
                this.saldo = novoSaldo;
                System.out.println("Você recebeu um desconto por ter uma conta especial.");
                return true;
            }
        } else {
            System.out.println("Você não tem saldo");
            return false;
        }
    }

    @Override
    public boolean depositar(double quantidade) {
        System.out.println("Você depositou na sua conta especial");
        return super.depositar(quantidade);
    }
}
