package Nivel_Intermediario.Polimorfismo;

public class Uchiha extends Ninja{

    @Override
   public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de fogo!");
    }

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }
}
