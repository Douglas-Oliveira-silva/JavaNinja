package Desafio4;

public class ninjaBasico implements  ninja{

    String nome;
    int idade;
    TipoHabilidade habilidade;

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }

    public void executarHabilidade() {
        System.out.println("Lançando habilidade " + habilidade + "!");
    }

    public ninjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }
}