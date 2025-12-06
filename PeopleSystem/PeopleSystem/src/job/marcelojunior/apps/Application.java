package job.marcelojunior.apps;

import job.marcelojunior.auxs.Cargo;
import job.marcelojunior.auxs.Endereco;
import job.marcelojunior.auxs.Profissao;
import job.marcelojunior.auxs.Telefone;
import job.marcelojunior.estruturas.ListaDeTelefonesNaoOrdenados;
import job.marcelojunior.pessoas.Cliente;
import job.marcelojunior.pessoas.Funcionario;
import job.marcelojunior.pessoas.Pessoa;
import java.time.LocalDate; // adicionado
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Menu para escolher Funcionário ou Cliente

        System.out.println("=====MENU DE CADASTRO=====");
        System.out.println("[1] - Cadastrar Funcionário");
        System.out.println("[2] - Cadastrar Cliente");
        System.out.print("\nDigite um número para selecionar o tipo de cadastro: ");
        int numCadastro = sc.nextInt();

        while (numCadastro != 1 && numCadastro != 2) {
            System.out.println("Opção inválida. Por favor, selecione 1 ou 2.");
            System.out.print("\nDigite um número para selecionar o tipo de cadastro: ");
            numCadastro = sc.nextInt();
        }

        //Cadastrar funcionário
        if (numCadastro == 1) {
            System.out.println("\n==CADASTRAR FUNCIONÁRIO==");
            //Criar lista novo funcionario
            List<Funcionario> funcionarioCad = new ArrayList<>();

            //Escolher quantos funcionários cadastrar
            System.out.print("Quantos funcionários deseja cadastrar? ");
            int qtdFuncionarios = sc.nextInt();

            for (int i = 0; i < qtdFuncionarios; i++) {
                Funcionario novoFuncionario = new Funcionario();
                //Cadastrar um Funcionário - Criar o objeto funcionario e definir os seus atributos
                System.out.println();
                System.out.println("Entre com as informações para o novo funcionário:");
                System.out.println();
                System.out.print("Matricula: ");
                int matriculaFunc = sc.nextInt();
                novoFuncionario.setMatricula(matriculaFunc);

                System.out.print("Nome: ");
                sc.nextLine();
                String nomeFunc = sc.nextLine();
                novoFuncionario.setNome(nomeFunc);

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                System.out.print("Data de Nascimento (dd/MM/yyyy): ");
                String dataStr = sc.nextLine().trim();
                LocalDate dataNascimento = LocalDate.parse(dataStr, dtf);
                novoFuncionario.setDataNascimento(dataNascimento);

                System.out.print("Endereço: \n");
                System.out.print("Logradouro: ");
                String enderecoLog = sc.nextLine();
                System.out.print("Complemento: ");
                String enderecoComp = sc.nextLine();
                System.out.print("Numero: ");
                String enderecoNum = sc.nextLine();
                System.out.print("Bairro: ");
                String enderecoBairro = sc.nextLine();
                System.out.print("Cidade: ");
                String enderecoCidade = sc.nextLine();
                System.out.print("CEP: ");
                String enderecoCEP = sc.nextLine();
                novoFuncionario.setEndereco(new Endereco(enderecoLog, enderecoComp, enderecoNum,
                        enderecoBairro, enderecoCidade, enderecoCEP));

                ListaDeTelefonesNaoOrdenados listaTelefones = new ListaDeTelefonesNaoOrdenados();
                System.out.print("Quantos telefones deseja cadastrar para o funcionário? \n (Mínimo 1 / Máximo 3): ");
                int qtdTelefones = sc.nextInt();

                while (qtdTelefones <= 0 || qtdTelefones > 3) {
                    System.out.println("\nQuantidade inválida! Por favor, digite um número para a quantidade" +
                            " de telefone(s) que deseja cadastrar.");
                    System.out.println("(Quantidade mínima: 1 / quantidade máxima: 3");
                    qtdTelefones = sc.nextInt();
                }
                for (int j = 0; j < qtdTelefones; j++) {
                    System.out.print("Qual o tipo de telefone? ");
                    String tipoTelefone = sc.next();
                    System.out.print("DDD: ");
                    String ddd = sc.next();
                    System.out.print("Número do Telefone: ");
                    String numero = sc.next();
                    Telefone telefone = new Telefone(tipoTelefone, ddd, numero);
                    novoFuncionario.adicionarTelefone(telefone);
                }

                System.out.print("Cargo: ");
                sc.nextLine();
                String cargo = sc.nextLine();
                novoFuncionario.setCargo(new Cargo(cargo));

                System.out.print("Salário: ");
                double salario = sc.nextDouble();
                novoFuncionario.setSalario(salario);
                sc.nextLine();

                System.out.print("Data de Admissão: ");
                String dataAdStr = sc.nextLine().trim();
                LocalDate dataAdmissao = LocalDate.parse(dataAdStr, dtf);
                novoFuncionario.setDataAdmissao(dataAdmissao);

                //adicionar funcionario novo a lista
                funcionarioCad.add(novoFuncionario);

                System.out.println("Funcionário cadastrado!");
            }


            //Imprimir os dados do Funcionário cadastrado
            System.out.println();
            System.out.println("=====DADOS DO(S) FUNCIONÁRIO(S)=====");


            for (Funcionario funcionario : funcionarioCad) {
                System.out.println(funcionario.getNome()); //imprimir apenas os nomes dos funcionários
//                System.out.println(funcionario);
            }


        } else if (numCadastro == 2) {

            System.out.println("\n==CADASTRAR CLIENTE==");
            //Criar lista novo cliente
            List<Cliente> clienteCad = new ArrayList<>();

            //Escolher quantos clientes cadastrar
            System.out.print("Quantos clientes deseja cadastrar? ");
            int qtdClientes = sc.nextInt();

            for (int i = 0; i < qtdClientes; i++) {
                Cliente novoCliente = new Cliente();
                //Cadastrar um Cliente - Criar o objeto cliente e definir os seus atributos
                System.out.println();
                System.out.println("Entre com as informações para o novo cliente:");
                System.out.println();
                System.out.print("Código: ");
                String codCliente = sc.next();
                novoCliente.setCodigo(codCliente);

                System.out.print("Nome: ");
                sc.nextLine();
                String nomeCliente = sc.nextLine();
                novoCliente.setNome(nomeCliente);

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                System.out.print("Data de Nascimento (dd/MM/yyyy): ");
                String dataStr = sc.nextLine().trim();
                LocalDate dataNascimento = LocalDate.parse(dataStr, dtf);
                novoCliente.setDataNascimento(dataNascimento);

                System.out.print("Endereço: \n");
                System.out.print("Logradouro: ");
                String enderecoLog = sc.nextLine();
                System.out.print("Complemento: ");
                String enderecoComp = sc.nextLine();
                System.out.print("Numero: ");
                String enderecoNum = sc.nextLine();
                System.out.print("Bairro: ");
                String enderecoBairro = sc.nextLine();
                System.out.print("Cidade: ");
                String enderecoCidade = sc.nextLine();
                System.out.print("CEP: ");
                String enderecoCEP = sc.nextLine();
                novoCliente.setEndereco(new Endereco(enderecoLog, enderecoComp, enderecoNum,
                        enderecoBairro, enderecoCidade, enderecoCEP));

                ListaDeTelefonesNaoOrdenados listaTelefones = new ListaDeTelefonesNaoOrdenados();
                System.out.print("Quantos telefones deseja cadastrar para o cliente? \n (Mínimo 1 / Máximo 3): ");
                int qtdTelefones = sc.nextInt();

                while (qtdTelefones <= 0 || qtdTelefones > 3) {
                    System.out.println("\nQuantidade inválida! Por favor, digite um número para a quantidade" +
                            " de telefone(s) que deseja cadastrar.");
                    System.out.println("(Quantidade mínima: 1 / quantidade máxima: 3");
                    qtdTelefones = sc.nextInt();
                }
                for (int j = 0; j < qtdTelefones; j++) {
                    System.out.print("Qual o tipo de telefone? ");
                    String tipoTelefone = sc.next();
                    System.out.print("DDD: ");
                    String ddd = sc.next();
                    System.out.print("Número do Telefone: ");
                    String numero = sc.next();
                    Telefone telefone = new Telefone(tipoTelefone, ddd, numero);
                    novoCliente.adicionarTelefone(telefone);
                }

                System.out.print("Profissão: ");
                sc.nextLine();
                String profissao = sc.nextLine();
                novoCliente.setProfissao(new Profissao(profissao));

                //adicionar cliente novo a lista
                clienteCad.add(novoCliente);

                System.out.println("Cliente cadastrado!");
            }


            //Imprimir os dados do Cliente cadastrado
            System.out.println();
            System.out.println("=====DADOS DO(S) CLIENTE(S)=====");


            for (Cliente cliente : clienteCad) {
                System.out.println(cliente.getNome()); //imprimir apenas os nomes dos clientes
//                System.out.println(cliente);
            }
//
//            //Cadastrar um Cliente - Criar o objeto cliente1 e definir os seus atributos
//            System.out.println();
//            Cliente cliente1 = new Cliente();
//            cliente1.setCodigo("501");
//            cliente1.setNome("Raquel Benaion");
//            cliente1.setDataNascimento(LocalDate.of(1996, 01, 11));
//            cliente1.setEndereco(new Endereco("Conjunto Maguari", "Alameda 8",
//                    "14", "Coqueiro", "Belém", "66823-068"));
////            cliente1.setTelsContato(new Telefone("91",  "9293-0090"));
////            cliente1.setTelsContato(new ListaDeTelefonesNaoOrdenados());
//            cliente1.setProfissao(new Profissao("Secretária"));
//
//            //Imprimir os dados do Cliente cadastrado
//            System.out.println("=====DADOS DO CLIENTE=====");
//            System.out.println(cliente1);
//        }

            sc.close();
        }
    }
}