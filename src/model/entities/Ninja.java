package model.entities;

public abstract class Ninja {
    public String nome;
    public String aldeia;
    public int idade;

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public Ninja() {
    }

    // Método concreto — comportamento comum a todos
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Idade: " + idade);
    }

    // Método abstrato — cada clan implementa do seu jeito
    public abstract void usarHabilidadeEspecial();
}
