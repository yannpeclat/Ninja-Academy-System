package model.entities;

public class Uzumaki extends Ninja{
    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uzumaki() {
        super();
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Modo Sábio ativado! 🍥");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Clã: Uzumaki");
        usarHabilidadeEspecial();
    }
}
