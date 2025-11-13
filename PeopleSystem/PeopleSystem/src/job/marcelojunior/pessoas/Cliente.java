package job.marcelojunior.pessoas;

import job.marcelojunior.auxs.Profissao;

public class Cliente extends Pessoa {

    private String codigo;
    private Profissao profissao;

    public Cliente(String codigo, Profissao profissao) {
        this.codigo = codigo;
        this.profissao = profissao;
    }

    public Cliente() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return
                "\nCódigo: " + codigo +
                "\nProfissão: " + profissao.getNomeProfissao() +
                "\nNome: " + nome +
                "\nData de Nascimento: " + dataNascimento +
                "\nTelefone: (" + telsContato.getDdd() + ") " + telsContato.getNumTelefone() +
                "\nEndereço: " + endereco.getLogradouro() + ", " + endereco.getNumero() + ", " + endereco.getBairro() + ", " + endereco.getCidade() + ", " + endereco.getCep();
    }
}