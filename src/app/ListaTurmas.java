package app;

import java.util.ArrayList;

public class ListaTurmas {

    private ArrayList<Turma> turmas;

    public ListaTurmas() {
        turmas = new ArrayList<Turma>();
    }

    public ArrayList<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(ArrayList<Turma> turmas) {
		this.turmas = turmas;
	}

    public void adicionarTurma(Turma turma) {
		this.turmas.add(turma);
	}

	public void apagarTudo() {
		this.turmas.clear();
	}

	public int obterQuantidadeDeTurmas() {
		return this.turmas.size();
	}

    @Override
	public String toString() {
		/* return "Lista de Turmas:" + Arrays.deepToString(turmas.toArray()); */
        return "Lista de Turmas: \n" + turmas;
	}

    
    
}
