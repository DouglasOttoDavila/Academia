package app;

public abstract class Pessoa {

    private String nome;
    private String dataNasc;
    private Telefone telefone;
    private Enderecos enderecos;

    public Pessoa(String nome, String dataNasc, Telefone telefone, Enderecos enderecos) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.enderecos = enderecos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Enderecos getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Enderecos enderecos) {
        this.enderecos = enderecos;
    }

    

    
}
