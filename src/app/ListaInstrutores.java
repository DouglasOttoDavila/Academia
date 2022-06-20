package app;

import java.util.ArrayList;

public class ListaInstrutores {

    private ArrayList<Instrutor> instrutores;

    public ListaInstrutores() {
        instrutores = new ArrayList<Instrutor>();
    }

    public ArrayList<Instrutor> getListaAlunos() {
		return instrutores;
	}

	public void setListaInstrutores(ArrayList<Instrutor> instrutores) {
		this.instrutores = instrutores;
	}

    public void adicionarInstrutores(Instrutor instrutores) {
		this.instrutores.add(instrutores);
	}

	public void apagarTudo() {
		this.instrutores.clear();
	}

	public int obterQuantidadeDeInstrutores() {
		return this.instrutores.size();
	}

	public Instrutor getInstrutores(int index) {
		return this.instrutores.get(index);
	}

	@Override
	public String toString() {
        return "Lista de Instrutores: \n" + instrutores;
	}

    
    
}
