package model.entities;

public class Uchiha extends Ninja {

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);  // Chama Ninja!
    }

    // Construtor vazio
    public Uchiha() {
        super();
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Sharingan ativado! 👁️");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Clã: Uchiha");
        usarHabilidadeEspecial();
    }
}
