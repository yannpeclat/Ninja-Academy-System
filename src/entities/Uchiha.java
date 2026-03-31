package entities;

public class Uchiha extends Ninja {
    String habilidadeEspecialUchiha = "Sharingan Ativado";


    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade Especial: " + habilidadeEspecialUchiha);
    }
}
