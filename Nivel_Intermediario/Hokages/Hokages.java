package Nivel_Intermediario.Hokages;

public abstract class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public abstract void sabedoriaHokage();

    // Construtor vazio, sem args
    public Hokages (){
    }

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
