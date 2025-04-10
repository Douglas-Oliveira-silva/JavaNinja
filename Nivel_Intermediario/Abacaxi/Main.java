package Nivel_Intermediario.Abacaxi;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------- Naruto Uzukami --------------------");

        Uzumaki Naruto = new Uzumaki("Uzumaki Naruto","Aldeia da Folha",18,150, NivelNinja.SENNIN, Biju.KURAMA);
        Naruto.habilidadeEspecial();
        Naruto.inteligenciaDeCombate(180);
        Naruto.estrategiaDeBatalhaNinja();
        Naruto.HabilidadeSennin();
        Naruto.tacarKunai();
        System.out.println(Naruto.altura);
        System.out.println(Naruto.bijus);


        System.out.println("-------------------- Sasuke Uchiha --------------------");

        Uchiha sasuke = new Uchiha("Sasuke uchiha", "Aldeia da folha", 18, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        System.out.println("-------------------- Itachi Uchiha --------------------");

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27, 60, NivelNinja.JOUNIN);
        itachi.habilidadeEspecial();

        System.out.println("-------------------- Madara Uchiha --------------------");

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da folha", 45,900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(170);
    }
}
