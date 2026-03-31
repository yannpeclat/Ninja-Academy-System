package entities;

public class Uzumaki extends Ninja{
    String habilidadeEspecialUzumaki = "Biju - Raposa de 7 Caldas";

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade Especial: " + habilidadeEspecialUzumaki);
    }
}
