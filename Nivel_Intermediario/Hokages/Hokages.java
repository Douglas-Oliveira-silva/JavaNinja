package Nivel_Intermediario.Hokages;

public class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;

    // Construtor vazio, sem args
    public Hokages (){ }

    // Criar um construtor com args
    public Hokages (String nome) {
        this.nome = nome;
    }

    public Hokages (int idade){
        this.idade = idade;
    }

    // All args constructor = construtor com todos os argumentos
    public Hokages(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

}
