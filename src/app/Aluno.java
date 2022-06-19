package app;

public class Aluno extends Pessoa {

    private int codMatricula;
    private String dataMatricula;
    private double altura;
    private double peso;

    Enderecos end = new Enderecos();
    
    public Aluno(String nome, String dataNasc, Telefone telefone, Enderecos enderecos, int codMatricula,
            String dataMatricula, double altura, double peso) {
        super(nome, dataNasc, telefone, enderecos);
        this.codMatricula = codMatricula;
        this.dataMatricula = dataMatricula;
        this.altura = altura;
        this.peso = peso;
    }

    public int getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEnd(Enderecos end){
        this.end = end;
    }

    

    
}
