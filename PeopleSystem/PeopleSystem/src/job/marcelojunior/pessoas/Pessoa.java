package job.marcelojunior.pessoas;

import job.marcelojunior.auxs.*;
import job.marcelojunior.estruturas.ListaDeTelefonesNaoOrdenados;

import java.time.LocalDate;
import java.time.Period; // adicionada a importação
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    protected String nome;
    protected LocalDate dataNascimento;
    //    protected ListaDeTelefonesNaoOrdenados telsContato;
    protected List<Telefone> telsContato = new ArrayList<>();
    protected Endereco endereco;

    public int obterIdade(){
        // calcular idade dinamicamente com a data atual (considera mês/dia)
        if(dataNascimento ==null){
            return 0;
        }

        LocalDate hoje = LocalDate.now();
        return Period.between(this.dataNascimento, hoje).getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Telefone> getTelsContato() {
        return telsContato;
    }

    public void adicionarTelefone(Telefone telefone) {
        this.telsContato.add(telefone);
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}