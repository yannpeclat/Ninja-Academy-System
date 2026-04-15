package model.entities;
import model.enums.Rank;

public class Senju extends Ninja {
    // Construtor SEM rank informado → chama super de 3 parâmetros → vira Genin
    public Senju(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    // Construtor COM rank informado → chama super de 4 parâmetros
    public Senju(String nome, int idade, String aldeia, Rank rankAtual) {
        super(nome, idade, aldeia, rankAtual);
    }

    @Override
    public String getHabilidadeEspecial() {
        return "Vitalidade Excepcional e WoodStyle ( Mokuton )";
    }
}
