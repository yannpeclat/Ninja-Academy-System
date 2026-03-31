package entities;

public class Ninja {
    public String nome;
    public String aldeia;
    public int idade;

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Idade: " + idade);
    }
}
