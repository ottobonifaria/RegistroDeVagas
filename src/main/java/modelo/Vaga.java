package modelo;

public class Vaga {
    private String tituloVaga;
    private String descricaoVaga;
    private String localAtuacao;
    private int tempoExperiencia;
    private String tecnologiaObrigatorias;
    private String tecnologiaDiferencias;
    private boolean ensinoSuperior;
    private String beneficios;

    public Vaga(String tituloVaga, String descricaoVaga, String localAtuacao,
                int tempoExperiencia, String tecnologiaObrigatorias, String tecnologiaDiferencias,
                boolean ensinoSuperior, String beneficios) {
        this.tituloVaga = tituloVaga;
        this.descricaoVaga = descricaoVaga;
        this.localAtuacao = localAtuacao;
        this.tempoExperiencia = tempoExperiencia;
        this.tecnologiaObrigatorias = tecnologiaObrigatorias;
        this.tecnologiaDiferencias = tecnologiaDiferencias;
        this.ensinoSuperior = ensinoSuperior;
        this.beneficios = beneficios;
    }

    public String getTituloVaga() {
        return tituloVaga;
    }

    public void setTituloVaga(String tituloVaga) {
        this.tituloVaga = tituloVaga;
    }

    public String getDescricaoVaga() {
        return descricaoVaga;
    }

    public void setDescricaoVaga(String descricaoVaga) {
        this.descricaoVaga = descricaoVaga;
    }

    public String getLocalAtuacao() {
        return localAtuacao;
    }

    public void setLocalAtuacao(String localAtuacao) {
        this.localAtuacao = localAtuacao;
    }

    public int getTempoExperiencia() {
        return tempoExperiencia;
    }

    public void setTempoExperiencia(int tempoExperiencia) {
        this.tempoExperiencia = tempoExperiencia;
    }

    public String getTecnologiaObrigatorias() {
        return tecnologiaObrigatorias;
    }

    public void setTecnologiaObrigatorias(String tecnologiaObrigatorias) {
        this.tecnologiaObrigatorias = tecnologiaObrigatorias;
    }

    public String getTecnologiaDiferencias() {
        return tecnologiaDiferencias;
    }

    public void setTecnologiaDiferencias(String tecnologiaDiferencias) {
        this.tecnologiaDiferencias = tecnologiaDiferencias;
    }

    public boolean isEnsinoSuperior() {
        return ensinoSuperior;
    }

    public void setEnsinoSuperior(boolean ensinoSuperior) {
        this.ensinoSuperior = ensinoSuperior;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

}
