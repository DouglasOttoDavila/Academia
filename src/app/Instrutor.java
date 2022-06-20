package app;

import java.util.ArrayList;

public class Instrutor extends Pessoa{

    private int id;
    private int rg;
    private String titulacao;
    private ArrayList<Turma> turmas;

    public Instrutor(int id, String nome, String dataNasc, Telefone telefone, Enderecos enderecos, int rg, String titulacao) {
        super(nome, dataNasc, telefone, enderecos);
        this.id = id;
        this.rg = rg;
        this.titulacao = titulacao;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public void adicionarTurma(Turma turma) {
		this.turmas.add(turma);
	}

    @Override
    public String toString() {
        return "ID: " + id
                + "\nNome: " + super.getNome() 
                + "\nData de Nascimento: " + super.getDataNasc() 
                + "\nRG: " + rg
                + "\nTitulação: " + titulacao
                + "\nTelefones: " + super.getTelefone()
                + "\nEndereço: " + super.getEnderecos()
                + "\nTurmas Ativas: " + turmas;
    }

    
    
}
