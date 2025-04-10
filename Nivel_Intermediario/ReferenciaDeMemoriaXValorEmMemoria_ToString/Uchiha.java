package Nivel_Intermediario.ReferenciaDeMemoriaXValorEmMemoria_ToString;

public class Uchiha extends Ninja{


    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public String toString() {
        return "Meu nome é: " + nome + " eu sou da " + aldeia + " e tenho " + idade + " anos";
    }
}