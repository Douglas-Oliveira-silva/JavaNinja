package Nivel_Intermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageKonoha {

    public void boasVindas(){
        System.out.println(nome +": Eu sou um Hatake");
    }

    // Metodo da interface
    @Override
    public void sharinganAtivado() {
        System.out.println("Sharigan Obito Ativado!");
    }

    public void ninjaDeElite(){
        System.out.println(nome + ": Eu já fui um ninja de elite da Anbu");
    }

    public void HokageAtivo(){
        System.out.println(nome + ": Eu sou o sexto Hokage de Konoha");
    }

}
