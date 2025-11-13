package marcelojunior.com.contas;

public class ContaInvestimento extends Conta {
    public double taxa;
    public int prazo;


    public ContaInvestimento(int numero, String nome, double taxa, int prazo) {
        super(numero, nome);
        this.taxa = taxa;
        this.prazo = prazo;
    }

    @Override
    public boolean sacar(double quantidade) {
        System.out.println("Sacou na sua Conta Investimento");
        return super.sacar(quantidade);
    }

    @Override
    public boolean depositar(double quantidade) {
        System.out.println("Depositou na sua Conta Investimento");
        return super.depositar(quantidade);
    }

    public void aplicarRendimento (double taxa) {
        double rendimento = this.saldo * taxa;
        this.saldo = this.saldo + rendimento;
        System.out.println("Sua conta rende " + rendimento +
                " ao mês, e agora sua conta tem: R$ " + this.saldo);
    }
}

