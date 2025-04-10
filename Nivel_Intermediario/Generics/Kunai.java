package Nivel_Intermediario.Generics;

public class Kunai {
    private String nome;

    public Kunai(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Kunai: " + nome;
    }
}
