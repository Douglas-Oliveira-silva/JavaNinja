package Nivel_Intermediario.Heranca_Interface;

public class Boruto extends Uzumaki implements HyugaUzumaki {

    @Override
    public void AtivarOKarma() {
        System.out.println("O karma foi ativado! Eu sou filho de Naruto e Hinata!");
    }

    @Override
    public void AtivarJougan() {
        System.out.println("Jougan foi ativado com sucesso!");
    }
}
