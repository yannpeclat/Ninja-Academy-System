package model.entities;
import model.enums.Rank;

public class Uchiha extends Ninja {
    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uchiha(String nome, int idade, String aldeia, Rank rankAtual) {
        super(nome, idade, aldeia, rankAtual);
    }

    @Override
    public String getHabilidadeEspecial() {
        return "Sharingan e Fire Style";
    }
}
