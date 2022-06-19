package app;

import java.util.ArrayList;

public class Telefone {
    
    private ArrayList<String> telefone = new ArrayList<String>();

    public Telefone(ArrayList<String> telefone) {
        this.telefone = telefone;
    }

    public ArrayList<String> getTelefone() {
        return telefone;
    }

    public void setTelefone(ArrayList<String> telefone) {
        this.telefone = telefone;
    }

}
