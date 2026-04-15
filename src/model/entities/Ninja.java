package model.entities;
import model.enums.Rank;
import java.util.ArrayList;
import java.util.List;
import model.interfaces.IMissionavel;

public abstract class Ninja implements IMissionavel {
    private String nome;
    private int idade;
    private String aldeia;
    private Rank rankAtual;
    private List<Mission> historicoMissoes;

    public Ninja(String nome, int idade, String aldeia, Rank rankAtual) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.rankAtual = rankAtual;
        this.historicoMissoes = new ArrayList<>();
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.rankAtual = Rank.GENIN;
        this.historicoMissoes = new ArrayList<>();
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

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public Rank getRankAtual() {
        return rankAtual;
    }

    public void setRankAtual(Rank rankAtual) {
        this.rankAtual = rankAtual;
    }

    public abstract String getHabilidadeEspecial();

    @Override
    public void adicionarMissao(Mission m) {
        historicoMissoes.add(m);
    }

    @Override
    public void editarMissao(int i, Mission m) {
        if (i >= 0 && i < historicoMissoes.size()) {
            historicoMissoes.set(i, m);
        }
    }

    @Override
    public List<Mission> getHistoricoMissoes() {
        return historicoMissoes;
    }

    @Override
    public boolean possuiMissoes() {
        return !historicoMissoes.isEmpty();
    }

    public void mostrarInfo () {
        System.out.println("-------------------------");
        System.out.println("--- Informações Ninja ---");
        System.out.println("-------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Rank: " + rankAtual);
        System.out.println("\nHabilidade Especial:");
        System.out.println("- " + getHabilidadeEspecial());
    }
}
