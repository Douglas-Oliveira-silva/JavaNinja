package Nivel_Intermediario.ReferenciaDeMemoriaXValorEmMemoria_ToString;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;

    public Ninja (String nome, String aldeia, int idade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "Meu nome é: " + nome + " eu sou da " + aldeia + " e tenho " + idade + " anos";
    }




}
