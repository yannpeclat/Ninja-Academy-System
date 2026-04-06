package model.entities;

public class Uzumaki extends Ninja{
    String habilidadeEspecialUzumaki = "Biju - Raposa de 7 Caldas";

    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uzumaki() {
        super();
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade Especial: " + habilidadeEspecialUzumaki);
    }
}
