package app;

public class Turma {

    private int id;
    private int numAlunos;
    private String horarioAula;
    private double duracaoAula;
    private String dataInicial;
    private String dataFinal;
    private String tipoAtividade;

    public Turma(int id, int numAlunos, String horarioAula, double duracaoAula, String dataInicial, String dataFinal,
            String tipoAtividade) {
        this.id = id;
        this.numAlunos = numAlunos;
        this.horarioAula = horarioAula;
        this.duracaoAula = duracaoAula;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.tipoAtividade = tipoAtividade;
    }

    public Turma() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumAlunos() {
        return numAlunos;
    }

    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }

    public String getHorarioAula() {
        return horarioAula;
    }

    public void setHorarioAula(String horarioAula) {
        this.horarioAula = horarioAula;
    }

    public double getDuracaoAula() {
        return duracaoAula;
    }

    public void setDuracaoAula(double duracaoAula) {
        this.duracaoAula = duracaoAula;
    }

    public String getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    @Override
    public String toString() {
        return "\nCod. Turma: " + id
                +"\nTipo de atividade: " + tipoAtividade 
                + "\nData inicial: " + dataInicial 
                + "\nData final: " + dataFinal 
                + "\nDuração da aula: " + duracaoAula + "h"
                + "\nHorário da aula: " + horarioAula 
                + "\nNúmero de alunos: " + numAlunos;
    }

    public void add(Turma turma) {
    }

    

    

    
    
}
