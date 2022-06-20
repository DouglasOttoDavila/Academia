package app;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        Utilidades ut = new Utilidades();
        ListaTurmas lt = new ListaTurmas();
        ListaAlunos la = new ListaAlunos();
        ListaInstrutores li = new ListaInstrutores();
        

        int contAlunos = 0;
        int contInstrutores = 0;

        int opcao = 0;

        while (opcao >= 0){
            System.out.println("| Sistema de Controle: ACADEMIA |");
            System.out.println("1 - Cadastrar Turma");
            System.out.println("2 - Visualizar Turmas");
            System.out.println("3 - Cadastrar Aluno");
            System.out.println("4 - Ver Alunos");
            System.out.println("5 - Cadastrar Instrutor");
            System.out.println("6 - Ver Instrutores");
            System.out.println("7 - Associar Aluno/Turma");
            System.out.println("8 - Associar Instrutor/Turma"); 
            System.out.println("9 - Sair");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    ut.limparTela();
                    System.out.println("Cod. da Turma: ");
                    int codTurma = scan.nextInt();
                    ut.limparTela();
                    System.out.println("Número de alunos: ");
                    int numAlunos = scan.nextInt();
                    ut.limparTela();
                    System.out.println("Horário da aula: ");
                    scan.nextLine();
                    String horario = scan.nextLine();
                    ut.limparTela();
                    System.out.println("Duração da aula: ");
                    double duracao = scan.nextDouble();
                    ut.limparTela();
                    System.out.println("Data inicial: ");
                    scan.nextLine();
                    String dataInic = scan.nextLine();
                    ut.limparTela();
                    System.out.println("Data final: ");
                    String dataFinal = scan.nextLine();
                    ut.limparTela();
                    System.out.println("Tipo de atividade: ");
                    String tipoAtv = scan.nextLine();
                    Turma turma = new Turma(codTurma, numAlunos, horario, duracao, dataInic, dataFinal, tipoAtv);
                    lt.adicionarTurma(turma);
                    ut.limparTela();
                    System.out.println("Turma cadastrada com sucesso!");
                    System.out.println(turma);
                    ut.aguardaInput();
                break;
                case 2:
                    ut.limparTela();
                    System.out.println(lt);
                    ut.aguardaInput();
                break;
                case 3:
                    ut.limparTela();
                    System.out.println("Nome: ");
                    scan.nextLine();
                    String nome = scan.nextLine();
                    ut.limparTela();
                    System.out.println("Data de Nascimento: ");
                    String dataNasc = scan.nextLine();
                    ut.limparTela();
                    System.out.println("Cod. da Matrícula: ");
                    int codMatricula = scan.nextInt();
                    ut.limparTela();
                    System.out.println("Data da Matrícula: ");
                    scan.nextLine();
                    String dataMatricula = scan.nextLine();
                    ut.limparTela();
                    System.out.println("Altura: ");
                    double altura = scan.nextDouble();
                    ut.limparTela();
                    System.out.println("Peso: ");
                    double peso = scan.nextDouble();
                    ut.limparTela();
                    System.out.println("DDD: ");
                    int ddd = scan.nextInt();
                    ut.limparTela();
                    System.out.println("Telefone: ");
                    int numeroTel = scan.nextInt();
                    ut.limparTela();
                    Telefone te = new Telefone(ddd, numeroTel);
                    System.out.println("CEP: ");
                    scan.nextLine();
                    String cep = scan.nextLine();
                    ut.limparTela();
                    System.out.println("Logradouro: ");
                    String logradouro = scan.nextLine();
                    ut.limparTela();
                    System.out.println("Número: ");
                    int numero = scan.nextInt();
                    ut.limparTela();
                    System.out.println("Complemento: ");
                    scan.nextLine();
                    String complemento = scan.nextLine();
                    ut.limparTela();
                    System.out.println("Bairro: ");
                    String bairro = scan.nextLine();
                    ut.limparTela();
                    System.out.println("Cidade: ");
                    String cidade = scan.nextLine();
                    ut.limparTela();
                    System.out.println("Estado: ");
                    String estado = scan.nextLine();
                    ut.limparTela();
                    Enderecos en = new Enderecos(logradouro, complemento, cep, numero, bairro, cidade, estado);
                    Aluno aluno = new Aluno(nome, dataNasc, te, en, codMatricula, dataMatricula, altura, peso);
                    la.adicionarAlunos(aluno);
                    ut.limparTela();
                    System.out.println("Aluno(a) cadastrado(a) com sucesso!");
                    System.out.println(aluno);
                    ut.aguardaInput();
                break;
                case 4:
                    ut.limparTela();
                    System.out.println(la);
                    ut.aguardaInput();
                break;
                case 5:
                    ut.limparTela();
                    contInstrutores ++;
                    System.out.println("Nome: ");
                    scan.nextLine();
                    nome = scan.nextLine();
                    ut.limparTela();
                    System.out.println("Data de Nascimento: ");
                    dataNasc = scan.nextLine();
                    ut.limparTela();
                    System.out.println("RG: ");
                    int rg = scan.nextInt();
                    ut.limparTela();
                    System.out.println("Titulação: ");
                    scan.nextLine();
                    String titulacao = scan.nextLine();
                    ut.limparTela();
                    System.out.println("DDD: ");
                    ddd = scan.nextInt();
                    ut.limparTela();
                    System.out.println("Telefone: ");
                    numeroTel = scan.nextInt();
                    ut.limparTela();
                    te = new Telefone(ddd, numeroTel);
                    System.out.println("CEP: ");
                    scan.nextLine();
                    cep = scan.nextLine();
                    ut.limparTela();
                    System.out.println("Logradouro: ");
                    logradouro = scan.nextLine();
                    ut.limparTela();
                    System.out.println("Número: ");
                    numero = scan.nextInt();
                    ut.limparTela();
                    System.out.println("Complemento: ");
                    scan.nextLine();
                    complemento = scan.nextLine();
                    ut.limparTela();
                    System.out.println("Bairro: ");
                    bairro = scan.nextLine();
                    ut.limparTela();
                    System.out.println("Cidade: ");
                    cidade = scan.nextLine();
                    ut.limparTela();
                    System.out.println("Estado: ");
                    estado = scan.nextLine();
                    ut.limparTela();
                    en = new Enderecos(logradouro, complemento, cep, numero, bairro, cidade, estado);
                    Instrutor instrutor = new Instrutor(contInstrutores, nome, dataNasc, te, en, rg, titulacao);
                    li.adicionarInstrutores(instrutor);
                    ut.limparTela();
                    System.out.println("Instrutor(a) cadastrado(a) com sucesso!");
                    System.out.println(instrutor);
                    ut.aguardaInput();
                break;
                case 6:
                    ut.limparTela();
                    System.out.println(li);
                    ut.aguardaInput();
                break;
                case 7:
                break;
                case 8:
                    System.out.println("Escolha um Instrutor da Lista: ");
                    System.out.println(li);
                    System.out.println("Digite o ID do Instrutor: ");
                    int idInstrutor = scan.nextInt();
                    
                    System.out.println("Escolha uma Turma da Lista");
                    System.out.println(lt);
                    System.out.println("Digite o ID da Turma: ");
                    int idTurma = scan.nextInt();

                    System.out.println(li.getInstrutores(idInstrutor-1));
                    System.out.println(lt.getTurmas(idTurma-1));

                    
                    

                break;
                case 9:
                    ut.limparTela();
					System.out.println("Sistema encerrado.");
					opcao = -1;
					ut.aguardaInput();
                break;
                default:
					ut.limparTela();
					System.out.println("Opção inválida.");
					ut.aguardaInput();
            }
        }
        scan.close();
    }
}
