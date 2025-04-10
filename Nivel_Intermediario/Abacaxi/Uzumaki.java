package Nivel_Intermediario.Abacaxi;

public class Uzumaki extends Ninja {

    Biju bijus;

    // Sobreescrever o metodo da classe Ninja

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank, Biju bijus) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
        this.bijus = bijus;
    }

    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki, um ataque de ar");
    }

    public void inteligenciaDeCombate(){
        System.out.println("Meu nome é: " + nome + "Essa é  minha INTELIGENCIA de combate");
    };

    public void inteligenciaDeCombate(int qi){
        if (qi > 150){
            System.out.println("Seu QI é: " + qi + " Você é um Gênio!");
        } else if (qi >= 130 ) {
            System.out.println("Seu QI é: " + qi + " Você é um ninja promissor!");
        }else {
            System.out.println("Seu QI é: " + qi + " Você precisa treinar mais sua inteligência!");
        }
    }

    public void HabilidadeSennin(){
        System.out.println("Meu nome é: " + nome + " Esse e esse é meu Senjutsu: Arte sábia dos sapos" );
    }

}
