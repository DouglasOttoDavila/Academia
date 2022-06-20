package app;

import java.util.ArrayList;

public class ListaAlunos {

    private ArrayList<Aluno> alunos;

    public ListaAlunos() {
        alunos = new ArrayList<Aluno>();
    }

    public ArrayList<Aluno> getListaAlunos() {
		return alunos;
	}

	public void setListaAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

    public void adicionarAlunos(Aluno alunos) {
		this.alunos.add(alunos);
	}

	public void apagarTudo() {
		this.alunos.clear();
	}

	public int obterQuantidadeDeAlunos() {
		return this.alunos.size();
	}

    @Override
	public String toString() {
        return "Lista de Alunos: \n" + alunos;
	}

    
    
}
