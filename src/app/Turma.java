package app;

public class Turma {

    private int numAlunos;
    private String horarioAula;
    private double duracaoAula;
    private String dataInicial;
    private String dataFinal;
    private String tipoAtividade;

    public Turma(int numAlunos, String horarioAula, double duracaoAula, String dataInicial, String dataFinal,
            String tipoAtividade) {
        this.numAlunos = numAlunos;
        this.horarioAula = horarioAula;
        this.duracaoAula = duracaoAula;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.tipoAtividade = tipoAtividade;
    }

    public Turma() {
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

    public void setDuracaoAula(int duracaoAula) {
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
        return "\nData inicial:" + dataInicial + "\nData final: " + dataFinal + "\nDuração da aula: " + duracaoAula + " (horas:minutos)."
                + "\nHorário da aula: " + horarioAula + "\nNúmero de alunos: " + numAlunos + "\nTipo de atividade: " + tipoAtividade 
                + "\n";
    }

    

    

    
    
}
