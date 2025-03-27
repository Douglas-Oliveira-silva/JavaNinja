package Nivel_Intermediario.Desafio3;

public class Uchiha extends Ninja {

    String habilidadeEspecial = "Chidori";

    public void mostrarInformacoes(){
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("missao = " + missao);
        System.out.println("nivel de dificuldade = " + nivelDificuldade);
        System.out.println("Status da missao = " + statusMissao);
        System.out.println("Habilidade Especial:" + habilidadeEspecial);
    }
}
