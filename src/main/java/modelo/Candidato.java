package modelo;

public class Candidato{

    private String nome;
    private int idade;
    private int tempoExp;
    private String tecnologias;
    private boolean ensinoSuperior;

    public Candidato(String nome, int idade, int tempoExp, String tecnologias, boolean ensinoSuperior) {
        this.nome = nome;
        this.idade = idade;
        this.tempoExp = tempoExp;
        this.tecnologias = tecnologias;
        this.ensinoSuperior = ensinoSuperior;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTempoExp() {
        return tempoExp;
    }

    public void setTempoExp(int tempoExp) {
        this.tempoExp = tempoExp;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    public boolean isEnsinoSuperior() {
        return ensinoSuperior;
    }

    public void setEnsinoSuperior(boolean ensinoSuperior) {
        this.ensinoSuperior = ensinoSuperior;
    }
}


