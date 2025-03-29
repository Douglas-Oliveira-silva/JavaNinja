package Nivel_Intermediario.Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalhaNinja {
    String nome;
    String aldeia;
    int idade;

    // metodo geral! todos os ninja vao ter | polimorfismo
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " e esse é meu ataque especial");
    }

    // metodo abstrato - obrigatorio em todas as classes (metodos abstratos nao recebem corpo
   // public abstract void estrategiaDeBatalhaNinja();

    // sobreescrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " Essa é minha estategia de combate");
    }

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }
}
