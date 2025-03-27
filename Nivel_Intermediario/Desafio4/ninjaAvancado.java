package Desafio4;

public class ninjaAvancado {

    String nome;
    int idade;
    TipoHabilidade habilidade;
    TipoHabilidade especialidade;

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
    }
    public void executarHabilidade(){
        System.out.println("Lançado habilidade " + habilidade + "!");
    }
    public void executarEspecialidade(){
        System.out.println("Lançado especialidade " + especialidade + "!");
    }
    public  ninjaAvancado(String nome, int idade, TipoHabilidade habilidade, TipoHabilidade especialidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

}
