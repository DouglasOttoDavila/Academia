package app;

public class Instrutor extends Pessoa{

    private int rg;
    private String titulacao;

    public Instrutor(String nome, String dataNasc, Telefone telefone, Enderecos enderecos, int rg, String titulacao) {
        super(nome, dataNasc, telefone, enderecos);
        this.rg = rg;
        this.titulacao = titulacao;
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
    
}
