package marcelojunior.com.contas;

public class ContaJunior extends Conta {
    public ContaEspecial contExp;

    public ContaJunior(int numero, String nome, ContaEspecial contExp) {
        super(numero, nome);
        this.contExp = contExp;
    }

    public void preencherLimite(double limite){
        contExp.limite = limite;
    }
}
