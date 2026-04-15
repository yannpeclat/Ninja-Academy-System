package model.entities;
import model.enums.Rank;

public class Nara extends Ninja {
    // Construtor SEM rank informado → chama super de 3 parâmetros → vira Genin
    public Nara(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    // Construtor COM rank informado → chama super de 4 parâmetros
    public Nara(String nome, int idade, String aldeia, Rank rankAtual) {
        super(nome, idade, aldeia, rankAtual);
    }

    @Override
    public String getHabilidadeEspecial() {
        return "Shadow Possession e QI Elevado";
    }
}
