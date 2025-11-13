package job.marcelojunior.apps;

// importa a classe Endereco do pacote auxs
import job.marcelojunior.auxs.Cargo;
import job.marcelojunior.auxs.Endereco;
// importa a classe Telefone do pacote auxs
import job.marcelojunior.auxs.Profissao;
import job.marcelojunior.auxs.Telefone;
// importa a classe Pessoa do pacote pessoas
import job.marcelojunior.pessoas.Cliente;
import job.marcelojunior.pessoas.Funcionario;
import job.marcelojunior.pessoas.Pessoa;
// importa LocalDate para criar/manipular datas
import java.time.LocalDate; // adicionado

// declara a classe Application que contém o metodo main
public class Application {
    // metodo principal que é ponto de entrada da aplicação
    public static void main(String[] args) {
//
//        // cria uma nova instância de Pessoa e referência com pessoa1
//        Pessoa pessoa1 = new Pessoa();
//        // cria outra instância de Pessoa e referência com pessoa2
//        Pessoa pessoa2 = new Pessoa();
//
//        // define o nome da pessoa1 como "Marcelo Junior"
//        pessoa1.setNome("Marcelo Junior");
//
//        // atribui data de nascimento 20/08/1994 a pessoa1 usando LocalDate.of(ano, mes, dia)
//        pessoa1.setDataNascimento(LocalDate.of(1994, 8, 20));
//
//        // cria uma instância de Telefone passando DDD e número
//        Telefone telefone1 = new Telefone("83", "987644188");
//
//        // associa o objeto telefone1 como telefone de contato de pessoa1
//        pessoa1.setTelsContato(telefone1);
//        // atualiza o número do telefone associado a pessoa1 (mesma informação reaplicada)
//        pessoa1.getTelsContato().setNumTelefone("987644188");
//
//        // cria um objeto Endereco com logradouro, complemento, número, bairro, cidade e CEP
//        Endereco endereco1 = new Endereco("Av Oceano Pacifico", "Apt",
//                "1240", "Intermares", "Cabedelo", "58102-236");
//
//
//        // associa o endereco1 a pessoa1
//        pessoa1.setEndereco(endereco1);
//        // associa o mesmo endereco1 a pessoa2 (compartilhando objeto)
//        pessoa2.setEndereco(endereco1);
//
//        // altera o logradouro do endereço (muda "Pacifico" para "Pacífico")
//        pessoa1.getEndereco().setLogradouro("Av Oceano Pacífico");
//
//
//        // imprime no console a idade calculada de pessoa1 chamando obterIdade()
//        System.out.println("Sou novinho, tenho " + pessoa1.obterIdade() + " anos.");
//        // imprime o nome de pessoa1
//        System.out.println("Meu nome é " + pessoa1.getNome() + ".");
//        // imprime o telefone de pessoa1 formatando DDD e número
//        System.out.println("Meu telefone é (" + pessoa1.getTelsContato().getDdd() + ") " + pessoa1.getTelsContato().getNumTelefone() + ".");
//        // imprime o endereço completo de pessoa1 concatenando vários campos
//        System.out.println("Moro na " + pessoa1.getEndereco().getLogradouro() + ", Nº " + pessoa1.getEndereco().getNumero() + ", Bairro: "
//                + pessoa1.getEndereco().getBairro() + ", Cidade: " + pessoa1.getEndereco().getCidade() + ", CEP: " + pessoa1.getEndereco().getCep() + ".");
//


        //ATIVIDADE

        //Criar menu para escolher Funcionário ou Cliente

        //Cadastrar um Funcionário - Criar o objeto funcionario1 e definir os seus atributos
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setMatricula(1001);
        funcionario1.setNome("Marcelo Junior");
        funcionario1.setDataNascimento(LocalDate.of(1994, 8, 20));
        funcionario1.setEndereco(new Endereco("Av Oceano Pacifico", "Apt",
                "1240", "Intermares", "Cabedelo", "58102-236"));
        funcionario1.setTelsContato(new Telefone("83", "987644188"));
        funcionario1.setCargo(new Cargo("Designer"));
        funcionario1.setSalario(1500.00);
        funcionario1.setDataAdmissao(LocalDate.of(2018, 2,20));


        //Imprimir os dados do Funcionário cadastrado
        System.out.println("=====DADOS DO FUNCIONÁRIO=====");
        System.out.println(funcionario1.toString());


        //Cadastrar um Cliente - Criar o objeto cliente1 e definir os seus atributos
        Cliente cliente1 = new Cliente();
        cliente1.setCodigo("501");
        cliente1.setNome("Raquel Benaion");
        cliente1.setDataNascimento(LocalDate.of(1996, 01, 11));
        cliente1.setEndereco(new Endereco("Conjunto Maguari", "Alameda 8",
                "14", "Coqueiro", "Belém", "66823-068"));
        cliente1.setTelsContato(new Telefone("91",  "9293-0090"));
        cliente1.setProfissao(new Profissao("Secretária"));

        System.out.println();
        System.out.println("=====DADOS DO CLIENTE=====");
        System.out.println(cliente1.toString());

    }
}