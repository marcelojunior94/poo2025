package job.marcelojunior.pessoas;

import job.marcelojunior.auxs.*;
import java.time.LocalDate;
import java.time.Period; // adicionada a importação

public class Pessoa {

    protected String nome;
    protected LocalDate dataNascimento;
    protected Telefone telsContato;
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

    public Telefone getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(Telefone telsContato) {
        this.telsContato = telsContato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}