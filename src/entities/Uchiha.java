package entities;

public class Uchiha extends Ninja {
    String habilidadeEspecialUchiha = "Sharingan Ativado";

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);  // Chama Ninja!
    }

    // Construtor vazio
    public Uchiha() {
        super();
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade Especial: " + habilidadeEspecialUchiha);
    }
}
