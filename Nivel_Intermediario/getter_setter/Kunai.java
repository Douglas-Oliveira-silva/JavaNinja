package Nivel_Intermediario.getter_setter;

public class Kunai {
    private String nome;

    public Kunai(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Kunai: " + nome;
    }
}
