package job.marcelojunior.pessoas;

import job.marcelojunior.auxs.Cargo;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private Integer matricula;
    private Cargo cargo;
    private double salario;
    private LocalDate dataAdmissao;

    public Funcionario(Integer matricula, Cargo cargo, double salario, LocalDate dataAdmissao) {
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public Funcionario() {
    }

    public void reajustarSalario(double percentual){
        if(percentual >0){
            salario += salario * (percentual / 100);
        }
    }

    public Cargo promover(Cargo novoCargo){
        this.cargo = novoCargo;
        return this.cargo;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return
                "\nMatrícula: " + matricula +
                "\nCargo: " + cargo.getNomeCargo() +
                "\nSalário: R$" + salario +
                "\nData de Admissão: " + dataAdmissao +
                "\nNome: " + nome +
                "\nData de Nascimento: " + dataNascimento +
                "\nTelefone: (" + telsContato.getDdd() +") " + telsContato.getNumTelefone() +
                "\nEndereco: " + endereco.getLogradouro() + ", " + endereco.getNumero() + ", " + endereco.getBairro() + ", " + endereco.getCidade() + ", " + endereco.getCep();
    }
}