package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        Utilidades ut = new Utilidades();
        ListaTurmas lt = new ListaTurmas();

        int opcao = 0;

        while (opcao >= 0){
            System.out.println("| Sistema de Controle: ACADEMIA |");
            System.out.println("1 - Cadastrar Turma");
            System.out.println("2 - Visualizar Turmas");
            /* System.out.println("3 - Visualizar Endereços");
            System.out.println("4 - Ver quantidade de Pessoas");
            System.out.println("5 - Ver quantidade de Endereços");
            System.out.println("6 - Apagar todas as Pessoas");
            System.out.println("7 - Apagar todos os Endereços");
            System.out.println("8 - Sair"); */

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
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
                    Turma turma = new Turma(numAlunos, horario, duracao, dataInic, dataFinal, tipoAtv);
                    lt.adicionarTurma(turma);
                    ut.limparTela();
                    System.out.println("Turma cadastrada com sucesso!");
                    System.out.println(lt);
                    ut.aguardaInput();
                break;
                case 2:
                    ut.limparTela();
                    System.out.println("Listagem de Turmas:");
                    System.out.println(lt);
                    ut.aguardaInput();
                break;
            }
        }
    }
}
