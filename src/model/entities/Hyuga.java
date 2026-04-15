package model.entities;

import model.enums.Rank;

public class Hyuga extends Ninja {
    // Construtor SEM rank informado → chama super de 3 parâmetros → vira Genin
    public Hyuga(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    // Hyuga COM rank informado → chama super de 4 parâmetros
    public Hyuga(String nome, int idade, String aldeia, Rank rankAtual) {
        super(nome, idade, aldeia, rankAtual);
    }

    @Override
    public String getHabilidadeEspecial() {
        return "Byakugan e Punho Suave";
    }
}
