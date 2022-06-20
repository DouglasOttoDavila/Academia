package app;

public class Enderecos {

    private String logradouro;
    private String complemento;
    private String cep;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;

    public Enderecos() {
    }

    public Enderecos(String logradouro, String complemento, String cep, int numero, String bairro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cep = cep;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "\nLogradouro: " + logradouro 
        + ", nº " + numero + ", " 
        + complemento + " - " 
        + bairro  + ". " 
        + "CEP: " + cep + ". " 
        + cidade + "/" 
        + estado + "."; 
    }

    

    

    



    

    
    
    
}
