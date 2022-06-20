package app;

public class Telefone {

    int ddd;
    int numero;
    
    public Telefone() {
    }

    public Telefone(int ddd, int numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nTelefone: (" + ddd + ")" + numero;
    }

    

}
