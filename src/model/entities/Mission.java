package model.entities;
import model.enums.MissionClassification;
import model.enums.MissionType;

public class Mission {
    private String nome;
    private MissionClassification classificacao;
    private String descricao;
    private double recompensa;
    private MissionType tipo;

    public Mission(String nome, MissionClassification classificacao, String descricao, double recompensa, MissionType tipo) {
        this.nome = nome;
        this.classificacao = classificacao;
        this.descricao = descricao;
        this.recompensa = recompensa;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public MissionClassification getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(MissionClassification c) {
        this.classificacao = c;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String d) {
        this.descricao = d;
    }

    public double getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(double r) {
        this.recompensa = r;
    }

    public MissionType getTipo() {
        return tipo;
    }

    public void setTipo(MissionType t) {
        this.tipo = t;
    }
}
